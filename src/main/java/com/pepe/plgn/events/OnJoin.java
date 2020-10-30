package com.pepe.plgn.events;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class OnJoin {

    public void init(Player player){
        player.sendMessage(ChatColor.DARK_GRAY +"Welcome " + ChatColor.BOLD + player.getName() +  ChatColor.RESET + ChatColor.DARK_GRAY + " to The " + ChatColor.BOLD + ChatColor.DARK_RED + " THE PEPE TEST CHAMBERS!");
        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1, 0);
    }
}
