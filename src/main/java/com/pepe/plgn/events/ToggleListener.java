package com.pepe.plgn.events;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.ArrayList;

public class ToggleListener implements Listener {

    ArrayList<Player> enabled = new ArrayList<>();

    @EventHandler
    public void onClick(PlayerInteractEvent e){
        // System.out.println("ToggleListener Enabled");       - test if works commented when not in testing
            Player player = e.getPlayer();
            //if(player.getMainHand().equals(Material.NETHER_STAR)) {    ((Not working for some reason lol))
            if(player.getItemInHand().getType().equals(Material.NETHER_STAR)) {
                if (enabled.contains(player)) {
                    player.sendMessage("Chat Enabled");
                    enabled.remove(player);
                } else {
                    player.sendMessage("Chat Disabled");
                    enabled.add(player);
                }
            }

    }

    @EventHandler
    public void onChat(AsyncPlayerChatEvent e){

        if (enabled.contains(e.getPlayer())){
            e.setCancelled(true);
            e.getPlayer().sendMessage("Disabled");
        }
    }
}
