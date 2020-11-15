package com.pepe.plgn.commands;

import org.bukkit.BanList;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Ban {

    public void init(Player player, String[] strings)
    {

        try
        {
            Bukkit.getBanList(BanList.Type.NAME).addBan(strings[1], ChatColor.RED + "You got BANNED: " + strings[2],null, null );

        }catch(Exception e){player.sendMessage("An error has accured");}
    }
}
