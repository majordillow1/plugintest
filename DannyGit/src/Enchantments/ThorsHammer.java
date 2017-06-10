/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enchantments;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.enchantments.EnchantmentTarget;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author knightmare
 */
public class ThorsHammer extends Enchantment{

    public ThorsHammer(int id) {
        super(id);
        
    }

    

   

   

    @Override
    public String getName() {
        return ("Thors Hammer");
    }

    @Override
    public int getMaxLevel() {
        return 30;
    }

    @Override
    public int getStartLevel() {
        return 5;
    }

    @Override
    public EnchantmentTarget getItemTarget() {
       return null;
    }

    @Override
    public boolean isTreasure() {
       return false;
    }

    @Override
    public boolean isCursed() {
       return false;
    }

    @Override
    public boolean conflictsWith(Enchantment e) {
       return false;
    }

    @Override
    public boolean canEnchantItem(ItemStack is) {
            return true;
       
        
       
    }
  
}
