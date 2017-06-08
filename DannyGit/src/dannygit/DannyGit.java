/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dannygit;

import Commands.HelloCommand;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author knightmare
 */
public class DannyGit extends JavaPlugin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
    }
    @Override
    public void onEnable(){
        getCommand("hello").setExecutor(new HelloCommand());
    }
    
    
}
