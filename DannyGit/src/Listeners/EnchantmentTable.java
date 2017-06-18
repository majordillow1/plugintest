/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;



import Enchantments.Achoo;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentOffer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EnchantingInventory;

/**
 *
 * @author knightmare
 */
public class EnchantmentTable implements Listener {
    EnchantmentOffer[] offer;
    @EventHandler
    public void addCustomEnchantToTable(PrepareItemEnchantEvent e){
       if(!e.getItem().hasItemMeta()){
           
       
        if(e.getItem().getType() == Material.SLIME_BALL){
         e.setCancelled(false);
         e.getOffers()[0] = new EnchantmentOffer(new Achoo(92), 1, 1);
            e.getOffers()[1] = null;
            e.getOffers()[2] = new EnchantmentOffer(Enchantment.ARROW_FIRE, 1, 1);
        e.getEnchanter().sendMessage("yo slime");
        
        }
    }else{return;}
       
    }
    
 
}
