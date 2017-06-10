/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;

/**
 *
 * @author dbena
 */
public class Farts implements Listener{
    @EventHandler
    public void Tootoot(PlayerToggleSneakEvent f){
        Player farter = f.getPlayer();
        if(farter.isSneaking()){
            farter.chat("Oopsies, I tooted");
        }
    }
}
