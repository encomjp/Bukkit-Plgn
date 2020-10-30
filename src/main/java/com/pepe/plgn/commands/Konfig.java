package com.pepe.plgn.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Konfig {
    public void init (Player player){
        String word = "Word";
        int number = 5;
        player.sendMessage(ChatColor.DARK_GRAY + "Word is: " + word + ChatColor.DARK_GREEN + " Number is: " + number);
    }
}
