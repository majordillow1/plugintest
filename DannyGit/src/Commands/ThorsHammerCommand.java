/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import Enchantments.Enchant;
import Enchantments.ThorsHammer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import util.Attachments;

/**
 *
 * @author knightmare
 */
public class ThorsHammerCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if(cs instanceof Player){
            //works
            Player p = ((Player) cs).getPlayer();
            
             ItemStack item = p.getInventory().getItemInMainHand();
            
            if(Attachments.canAttachThorsHammer(item)){
                if(p.hasPermission("CustomEnchantments.SuperWeapon.get")){
                Enchant.addThorEnchant(item, 1);
            }else{
                    p.sendMessage("you dont have perms");
                }
              
            }
            else
                    {
                        cs.sendMessage("This item cannot have this enchantment");
                    }
        }else{
            cs.sendMessage("You must be a player to do this!");
        }
        return false;
    }
    
}
