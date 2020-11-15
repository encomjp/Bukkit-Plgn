package com.pepe.plgn.events;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener{

    @EventHandler
    public void onPlace(BlockPlaceEvent e) {
        Player player = e.getPlayer();

        if (e.getBlockPlaced().getType().equals(Material.TNT)){
            e.getBlockPlaced().setType(Material.AIR);
            e.setCancelled(true);
            e.getPlayer().sendMessage(ChatColor.DARK_RED + "TNT is not Allowed!");
        }

    }
}
