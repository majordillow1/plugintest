/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enchantments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import util.RomanNumbers;

/**
 *
 * @author knightmare
 */
public class Enchant implements Listener{
 @EventHandler
 public void AddEnchant(EnchantItemEvent e){
     ItemStack item = e.getItem();
     if(item.getType().equals(Material.DIAMOND_AXE)){
        // e.getEnchanter().sendMessage("its been enchanted");
       // addThorEnchant(item,1);
           /* ThorsHammer thorshammer = new ThorsHammer(90);
            item.getItemMeta().addEnchant(thorshammer, 1, true);
           ArrayList lore = (ArrayList) item.getItemMeta().getLore();
           lore.add("Thors Hammer");
           item.getItemMeta().setLore(lore);  
           */
     }
     if(item.getType().equals(Material.WOOD_SWORD)|| item.getType().equals(Material.IRON_SWORD)||item.getType().equals(Material.STONE_SWORD)|| item.getType().equals(Material.DIAMOND_SWORD)){
         if( Math.random() <= 0.5 ) {
             addPoisionSwordEnchant(item,1);
            }
     }
 }
 public static ItemStack addThorEnchant(ItemStack target, int level) {
     ThorsHammer thorshammer = new ThorsHammer(90);
target.addUnsafeEnchantment(thorshammer, level);
//first, add the enchant (ench) to the itemstack, this is created with the code of this page.
    ItemMeta targetmeta = (ItemMeta) target.getItemMeta();
//get the metadata
    Map<Enchantment,Integer> enchantments = target.getEnchantments();
//real, not good formated enchants
    Iterator<Entry<Enchantment,Integer>> iter = enchantments.entrySet().iterator();
    ArrayList<String> enc = new ArrayList<String>();
//array with the correct enchants
    while(iter.hasNext()){
    Entry<Enchantment,Integer> entry = iter.next();
    String lvl = RomanNumbers.run(entry.getValue());
//translate the number, see the bottom for the code
    enc.add(ChatColor.RESET + "" + ChatColor.GRAY + entry.getKey().getName().toString() + " " + lvl);
//add the enchant name to the array
    }
    targetmeta.setLore(enc);
//add the lore
    target.setItemMeta(targetmeta);
    return target;
//return the itemstack
}
 public static ItemStack addPoisionSwordEnchant(ItemStack target, int level) {
     PoisionSword poisionsword = new PoisionSword(91);
target.addUnsafeEnchantment(poisionsword, level);
//first, add the enchant (ench) to the itemstack, this is created with the code of this page.
    ItemMeta targetmeta = (ItemMeta) target.getItemMeta();
//get the metadata
    Map<Enchantment,Integer> enchantments = target.getEnchantments();
//real, not good formated enchants
    Iterator<Entry<Enchantment,Integer>> iter = enchantments.entrySet().iterator();
    ArrayList<String> enc = new ArrayList<String>();
//array with the correct enchants
    while(iter.hasNext()){
    Entry<Enchantment,Integer> entry = iter.next();
    String lvl = RomanNumbers.run(entry.getValue());
//translate the number, see the bottom for the code
    enc.add(ChatColor.RESET + "" + ChatColor.GRAY + entry.getKey().getName().toString() + " " + lvl);
//add the enchant name to the array
    }
    targetmeta.setLore(enc);
//add the lore
    target.setItemMeta(targetmeta);
    return target;
//return the itemstack
}
}
