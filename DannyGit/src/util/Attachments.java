/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 *
 * @author knightmare
 */
public class Attachments {
    public static Boolean canAttachThorsHammer(ItemStack item){
        if(item.getType() == Material.DIAMOND_AXE){
            return true;
        }
          if(item.getType() == Material.STICK){
              return true;
          }
        return false;
    }
    public static Boolean canAttachPoisionSword(ItemStack item){
        if(item.getType() == Material.WOOD_SWORD || item.getType() == Material.IRON_SWORD || item.getType()==Material.STONE_SWORD||item.getType()==Material.GOLD_SWORD||item.getType()==Material.DIAMOND_SWORD){
            return true;
        }
        return false;
    }
}
