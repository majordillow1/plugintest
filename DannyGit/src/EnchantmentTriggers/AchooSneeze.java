/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnchantmentTriggers;

import dannygit.DannyGit;
import org.bukkit.entity.LlamaSpit;
import org.bukkit.entity.Player;
import org.bukkit.craftbukkit.Main;
import org.bukkit.event.Listener;

/**
 *
 * @author dbena
 */
public class AchooSneeze implements Listener{
    public static void Sneeze(Player s){
                 s.launchProjectile(LlamaSpit.class);
      s.chat("ACHOO!!");
        }  
    }