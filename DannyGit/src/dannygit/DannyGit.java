/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dannygit;

import Commands.HelloCommand;
import Enchantments.Enchant;
import Enchantments.ThorsHammer;
import Listeners.Farts;
import Listeners.WeaponListener;
import java.lang.reflect.Field;
import static org.bukkit.Bukkit.getLogger;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author knightmare
 */
public class DannyGit extends JavaPlugin {

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void onEnable(){
        //testing my name
        getCommand("hello").setExecutor(new HelloCommand());
      getServer().getPluginManager().registerEvents(new Enchant(), this);
      getServer().getPluginManager().registerEvents(new WeaponListener(), this);
    registerThorsHammer();
    getServer().getPluginManager().registerEvents(new Farts(), this);
    }
    public static void main(String[] args) {
        // TODO code application logic here
          
        
    }
    public void registerThorsHammer(){
        try {
            Field f = Enchantment.class.getDeclaredField("acceptingNew");
            f.setAccessible(true);
            f.set(null, true);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ThorsHammer thorshammer = new ThorsHammer(90);
            Enchantment.registerEnchantment(thorshammer);
        }
        catch (IllegalArgumentException e){
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
