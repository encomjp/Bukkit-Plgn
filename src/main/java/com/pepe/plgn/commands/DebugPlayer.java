package com.pepe.plgn.commands;

import org.bukkit.World;
import org.bukkit.entity.Player;

public class DebugPlayer {
    public void init(Player player){
        if(player instanceof Player)
        {
            World currentWorldOfPlayer = player.getWorld();
            player.setHealth(20); // 10 hearths = 20 half hearth
            player.sendMessage("Hello Player, you're currently in: " + currentWorldOfPlayer);
        } else
        {
            System.out.println("You cannot use this command through Console!");
        }
    }
}
