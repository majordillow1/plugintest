/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import EnchantmentTriggers.ThorsHammerFire;
import Enchantments.ThorsHammer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author knightmare
 */
public class WeaponListener implements Listener {
    @EventHandler
    public void ClickListener(PlayerInteractEvent e){
        ItemStack item = e.getItem();
        if(e.getItem().getEnchantmentLevel(new ThorsHammer(90))!= 0){
            if(e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK){
                e.getPlayer().sendMessage("fire thors hammer");
                ThorsHammerFire.FireThorsHammer(e.getPlayer());
            }
            
        }
    }
}
