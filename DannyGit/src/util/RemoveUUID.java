/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import Listeners.WeaponListener;
import java.util.UUID;
import org.bukkit.scheduler.BukkitRunnable;

/**
 *
 * @author dbena
 */
public class RemoveUUID extends BukkitRunnable{
private UUID uuid;
public RemoveUUID(UUID uuid){
    this.uuid=uuid;
}
    @Override
    public void run() {
    WeaponListener.cooldown.remove(uuid);
    }
    
}
