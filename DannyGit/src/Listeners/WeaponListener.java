/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import EnchantmentTriggers.ThorsHammerFire;
import Enchantments.PoisionSword;
import Enchantments.ThorsHammer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 *
 * @author knightmare
 */
public class WeaponListener implements Listener {
    @EventHandler
    public void ClickListener(PlayerInteractEvent e){
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(e.getItem() != null && e.getItem().hasItemMeta()){
                if(e.getItem().getItemMeta().hasEnchant(new ThorsHammer(90))){
                
            
                ItemStack item = e.getItem();
                ThorsHammerFire.FireThorsHammer(e.getPlayer());
                }else{return;}
            }
            else
            {
                return;
            }
       }
    }

        
        
        
            
        
        
           
            
       
        
        
    
    @EventHandler
    public void addPoisionSword(EntityDamageEvent e){
        if(e.getEntity() instanceof Player){
            Player p = (Player) e.getEntity();
           EntityDamageByEntityEvent damageEvent = (EntityDamageByEntityEvent) e;
         if (damageEvent.getDamager() instanceof Player) {
         Player damager = (Player) damageEvent.getDamager();
         if(damager.getInventory().getItemInMainHand().getItemMeta().hasEnchant(new PoisionSword(91))){
             if(!p.getActivePotionEffects().contains(PotionEffectType.POISON)){
                 p.addPotionEffect(new PotionEffect(PotionEffectType.POISON,200,0));
             }
         }
         }
        }
    }
}
