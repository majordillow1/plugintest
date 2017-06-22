/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enchantments;

import Listeners.EnchantmentTable;
import dannygit.DannyGit;
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
import org.bukkit.plugin.Plugin;
import util.Attachments;
import util.RomanNumbers;

/**
 *
 * @author knightmare
 */
public class Enchant implements Listener{
     DannyGit plugin;
    public Enchant(DannyGit instance){
        plugin = instance;
    }
public static boolean Thorhammerb = false;
   public static boolean PoisionSwordb = false;

    
 @EventHandler
 public void AddEnchant(EnchantItemEvent e){
     ItemStack item = e.getItem();
     if(e.getItem().getType() == Material.SLIME_BALL){
         e.setCancelled(false);
         if(e.whichButton()==0){
             addAchooEnchant(item,1);
         }
     }
     
     
     
     if(Attachments.canAttachThorsHammer(e.getItem())){
         if(Thorhammerb){
             if(e.whichButton() == 0){
                 e.getEnchantsToAdd().clear();
                 addThorEnchant(item,1);
             }
         }
        // e.getEnchanter().sendMessage("its been enchanted");
       // addThorEnchant(item,1);
           /* ThorsHammer thorshammer = new ThorsHammer(90);
            item.getItemMeta().addEnchant(thorshammer, 1, true);
           ArrayList lore = (ArrayList) item.getItemMeta().getLore();
           lore.add("Thors Hammer");
           item.getItemMeta().setLore(lore);  
           */
     }
     if(Attachments.canAttachPoisionSword(e.getItem())){
        if(PoisionSwordb){
            e.getEnchantsToAdd().clear();
             addPoisionSwordEnchant(item,1);
        }
         
            
            
     }
     // if(item.getType().equals(Material.SLIME_BALL)){
         //double y = plugin.getConfig().getDouble("Probability.Achoo");
         //if(x<= y){
         //    addAchooEnchant(item,1);
        // }
      //}
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
 public static ItemStack addAchooEnchant(ItemStack target, int level) {
     Achoo achoo = new Achoo(92);
 target.addUnsafeEnchantment(achoo, level);
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
