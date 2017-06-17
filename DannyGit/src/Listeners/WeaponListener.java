/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import EnchantmentTriggers.AchooSneeze;
import EnchantmentTriggers.ThorsHammerFire;
import Enchantments.PoisionSword;
import Enchantments.ThorsHammer;
import Enchantments.Achoo;
import dannygit.DannyGit;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
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
import util.RemoveUUID;

/**
 *
 * @author knightmare
 */
public class WeaponListener implements Listener {
    public static Set<UUID> cooldown = new HashSet<>();
    
    DannyGit plugin;
    public WeaponListener(DannyGit pl){
        plugin = pl;
    }
    @EventHandler
    public void ClickListener(PlayerInteractEvent e){

    long FireRate = plugin.getConfig().getLong("Achoo.FireRate");
        if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
            if(e.getItem() != null && e.getItem().hasItemMeta()){
                if(e.getItem().getItemMeta().hasEnchant(new ThorsHammer(90))){

        ItemStack item = e.getItem();
                ThorsHammerFire.FireThorsHammer(e.getPlayer());

                }
                else
                {
                    if(e.getItem().getItemMeta().hasEnchant(new Achoo(92))){
                        UUID puuid = e.getPlayer().getUniqueId();
                        if(!cooldown.contains(puuid)){
                             AchooSneeze.Sneeze(e.getPlayer());
                             cooldown.add(puuid);
                             new RemoveUUID(puuid).runTaskLater(plugin, FireRate);
                             
                        }                                
       }}
            }
            else
            {
                return;
            }
       }
    }
    

        
        
        
            
        
        
           
            
       @EventHandler
       public void AddPoisionSword(EntityDamageByEntityEvent e){
           if(e.getEntity() instanceof Player){
               Player p = (Player) e.getEntity();
               if(e.getDamager() instanceof Player){
                   Player damager = (Player) e.getDamager();
                   if(damager.getInventory().getItemInMainHand() != null && damager.getInventory().getItemInMainHand().hasItemMeta()){
                       if(damager.getInventory().getItemInMainHand().getItemMeta().hasEnchant(new PoisionSword(91))){
                           p.addPotionEffect(new PotionEffect(PotionEffectType.POISON,200,0)); 
                       }
                   }else{return;}
               }else{return;}
           }else{return;}
       }
        
        
    
    
    
    
    
}

