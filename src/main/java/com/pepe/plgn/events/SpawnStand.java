package com.pepe.plgn.events;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.EulerAngle;

public class SpawnStand {
        @SuppressWarnings("deprecation")
    public void init(Location location){
        ArmorStand stand = (ArmorStand) location.getWorld().spawnEntity(location, EntityType.ARMOR_STAND);
        stand.setHeadPose(new EulerAngle(Math.toRadians(52),Math.toRadians(125), Math.toRadians(81)));
        stand.setHelmet(new ItemStack(Material.DRAGON_HEAD));
        stand.setChestplate(new ItemStack(Material.GOLDEN_CHESTPLATE));
        stand.setInvisible(true);
        stand.setGravity(true);
        stand.setInvulnerable(true);
    }
}
