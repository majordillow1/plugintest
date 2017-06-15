/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnchantmentTriggers;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.util.BlockIterator;

/**
 *
 * @author knightmare
 */
public class ThorsHammerFire {
    public static void FireThorsHammer(Player p){
        if(p.hasPermission("CustomEnchantments.SuperWeapon.Wield")){
           int radius = 10;
			Block b = getTargetBlock(p, 100);
			Location bly = b.getLocation().add(0,1,0);
			p.getWorld().createExplosion(bly.getX(),bly.getY(),bly.getZ(),40,true);
			for(int i = 0; i < radius; i ++){
				double angle = 2 * Math.PI * i / radius;
				Location point = bly.clone().add(radius * Math.sin(angle),0.0d, radius * Math.cos(angle));
			/*	e.getPlayer().getWorld().spawnEntity(point, EntityType.CREEPER); */
				p.getWorld().strikeLightning(point);
          } 
        }else{
            p.sendMessage("you can't wield this....why do you have it?");
        }
          
    }
     private static final Block getTargetBlock(Player player, int range) {
    BlockIterator iter = new BlockIterator(player, range);
    Block lastBlock = iter.next();
    while (iter.hasNext()) {
        lastBlock = iter.next();
        if (lastBlock.getType() == Material.AIR) {
            continue;
        }
        break;
    }
    return lastBlock;
} 
}
