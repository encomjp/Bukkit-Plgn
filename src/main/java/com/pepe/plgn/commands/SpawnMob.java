package com.pepe.plgn.commands;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;

public class SpawnMob {
    @SuppressWarnings("deprecation")
    public void init(Player player, String[] strings){
        Location spawnLoc = player.getLocation().add(2, 0, 0);
        World world = player.getWorld();
        try{
            if (strings[2].equalsIgnoreCase("jockey")) {
                Spider spider = (Spider) world.spawnEntity(spawnLoc, EntityType.SPIDER);
                Skeleton skeleton = (Skeleton) world.spawnEntity(spawnLoc, EntityType.SKELETON);
                spider.setPassenger(skeleton);
                spider.setCustomName("Cat");
                spider.setCustomNameVisible(true);
                spider.setGlowing(true);
                skeleton.setGlowing(true);
                spider.setGravity(false);
            }else if (strings[2].equalsIgnoreCase("Giant")) {
                Giant giant = (Giant) world.spawnEntity(spawnLoc, EntityType.GIANT);
                giant.setCustomName("Little Boy");
                giant.setCustomNameVisible(true);
            }
        } catch(Exception e) {player.sendMessage("Command has failed");}

    }
}
