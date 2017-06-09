/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commands;

import Enchantments.ThorsHammer;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

/**
 *
 * @author knightmare
 */
public class HelloCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender cs, Command cmnd, String string, String[] strings) {
        if(cs instanceof Player){
            cs.sendMessage("What up brah");
            //Henlo Jacobi... I can see you coding right now...
            ItemStack item = new ItemStack(Material.STICK);
            ItemMeta itemMeta = item.getItemMeta();
            ThorsHammer thorshammer = new ThorsHammer(90);
            itemMeta.addEnchant(thorshammer, 1, true);
            item.setItemMeta(itemMeta);
            Player player = ((Player) cs).getPlayer();
            player.getInventory().addItem(item);
            player.updateInventory();
            
        }else{
            cs.sendMessage("bruh youre not a player");
        }
        return false;
    }
    
}
