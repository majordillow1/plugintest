/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import Enchantments.ThorsHammer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

/**
 *
 * @author knightmare
 */
public class PickupListenerSuperWeapons implements Listener {
    @EventHandler
    public void pickup(PlayerPickupItemEvent e){
        Player p = e.getPlayer();
        if(e.getItem().getItemStack().getEnchantmentLevel(new ThorsHammer(90))!=0){
            if(!p.hasPermission("CustomEnchantments.SuperWeapon.Wield")){
               p.sendMessage("You don't have the power to wield this item!");
               p.setHealth(0);
               Bukkit.broadcastMessage(p.getName() + " pulled a muscle trying to pick up Thor's Hammer");
               p.getWorld().strikeLightning(p.getLocation());
               e.setCancelled(true);
            }
            
        }
        
    }
}
