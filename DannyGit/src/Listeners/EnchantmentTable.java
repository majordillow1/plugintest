/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;



import Enchantments.Achoo;
import Enchantments.Enchant;
import Enchantments.PoisionSword;
import Enchantments.ThorsHammer;
import dannygit.DannyGit;
import org.bukkit.Material;
import org.bukkit.enchantments.EnchantmentOffer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.enchantment.PrepareItemEnchantEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EnchantingInventory;
import util.Attachments;

/**
 *
 * @author knightmare
 */
public class EnchantmentTable implements Listener {
     DannyGit plugin;
  
    public EnchantmentTable(DannyGit instance){
        plugin = instance;
    }
    EnchantmentOffer[] offer;
    @EventHandler
    public void addCustomEnchantToTable(PrepareItemEnchantEvent e){
        double x = Math.random();
    
       if(!e.getItem().hasItemMeta()){
           
       
        if(e.getItem().getType() == Material.SLIME_BALL){
           
         double y = plugin.getConfig().getDouble("Probability.Achoo");
         if(x<= y){
             e.setCancelled(false);
         
         e.getOffers()[0] = new EnchantmentOffer(new Achoo(92),1,1);
            e.getOffers()[1] = null;
            e.getOffers()[2] = null;
       
        
         }
            
            
            
            
         
        
        
    }else{
       if(Attachments.canAttachThorsHammer(e.getItem())){
           double y = plugin.getConfig().getDouble("Probability.ThorsHammer");
           if(x<=y){
               e.getOffers()[0] = new EnchantmentOffer(new ThorsHammer(90),1,1);
               Enchant.Thorhammerb = true;
           }else{
               Enchant.Thorhammerb=false;
           }
       }
        if(Attachments.canAttachPoisionSword(e.getItem())){
            double y = plugin.getConfig().getDouble("Probability.PoisionSword");
            if(x<=y){
                e.getOffers()[0] = new EnchantmentOffer(new PoisionSword(91),1,1);
                Enchant.PoisionSwordb = true;
            }else{
                Enchant.PoisionSwordb = false;
            }
        }}
       
    }else{return;}
    
 
}

  

   
}
