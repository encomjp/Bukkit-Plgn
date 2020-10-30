package com.pepe.plgn.commands;

import org.bukkit.entity.Player;

public class Heal {
    public void init(Player player){
        player.setHealth(20.0);
        player.sendMessage("You've been healed");
    }
}
