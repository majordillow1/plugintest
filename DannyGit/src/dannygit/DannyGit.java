/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dannygit;


import Commands.PoisionSwordcommand;
import Commands.ReloadConfig;
import Commands.ThorsHammerCommand;
import Commands.AchooCommand;
import Enchantments.Enchant;
import Enchantments.PoisionSword;
import Enchantments.ThorsHammer;
import Enchantments.Achoo;
import Listeners.Farts;
import Listeners.PickupListenerSuperWeapons;
import Listeners.WeaponListener;
import java.io.File;
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
        getCommand("poisionsword").setExecutor(new PoisionSwordcommand());
        getCommand("EnchantmentReload").setExecutor(new ReloadConfig(this));
        getCommand("achoo").setExecutor(new AchooCommand());
        getServer().getPluginManager().registerEvents(new PickupListenerSuperWeapons(), this);
        getCommand("thorshammer").setExecutor(new ThorsHammerCommand());
      getServer().getPluginManager().registerEvents(new Enchant(this), this);
      getServer().getPluginManager().registerEvents(new WeaponListener(), this);
    registerEnchantments();
    createConfig();
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
          
        
    }
    public void registerEnchantments(){
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
            PoisionSword poisionsword = new PoisionSword(91);
            Enchantment.registerEnchantment(poisionsword);
            Achoo achoo = new Achoo(92);
            Enchantment.registerEnchantment(achoo);
        }
        catch (IllegalArgumentException e){
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    private void createConfig() {
    try {
        if (!getDataFolder().exists()) {
            getDataFolder().mkdirs();
        }
        File file = new File(getDataFolder(), "config.yml");
        if (!file.exists()) {
            getLogger().info("Config.yml not found, creating!");
            saveDefaultConfig();
        } else {
            getLogger().info("Config.yml found, loading!");
        }
    } catch (Exception e) {
        e.printStackTrace();

    }

}
    
}
