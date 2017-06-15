/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import dannygit.DannyGit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 *
 * @author knightmare
 */
public class ReloadConfig implements CommandExecutor{
 DannyGit plugin;
    public ReloadConfig(DannyGit instance){
        plugin = instance;
    }
    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if(cs.hasPermission("CustomEnchantments.get")){
            
            plugin.reloadConfig();
        }
        return false;
    }
    
}
