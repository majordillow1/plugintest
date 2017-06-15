/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import Enchantments.Enchant;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import util.Attachments;

/**
 *
 * @author knightmare
 */
public class PoisionSwordcommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
       if(cs instanceof Player){
           Player p = ((Player) cs).getPlayer();
           if(p.hasPermission("CustomEnchantments.get")){
                ItemStack item = p.getInventory().getItemInMainHand();
                 if(Attachments.canAttachPoisionSword(item)){
                     Enchant.addPoisionSwordEnchant(item, 1);
                 }else{
                     p.sendMessage("cant attach this to this item");
                 }
           }else{
               p.sendMessage("you dont have permission");
           }
           
       }else{
           cs.sendMessage("you arent a player");
       }
       return false;
    }
    
}
