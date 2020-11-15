package com.pepe.plgn.commands;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Kick {

    public void init(Player player, String[] strings)
    {
        player.kickPlayer(ChatColor.DARK_PURPLE + "ZeroGCraft Gaming Network \n" +
                        ChatColor.MAGIC + "*****************************\n" + ChatColor.RESET +
                        ChatColor.DARK_RED + "You've been kicked\n " + ChatColor.RESET +
                        ChatColor.DARK_PURPLE + ChatColor.MAGIC + "*****************************\n" + ChatColor.RESET +
                        ChatColor.DARK_RED + "Reason:  " + ChatColor.RESET + ChatColor.BOLD + strings[2] );
                        Bukkit.broadcastMessage(ChatColor.DARK_RED + strings[1] + " Has been kicked!");
    }
}
