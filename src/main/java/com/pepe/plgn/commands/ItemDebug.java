package com.pepe.plgn.commands;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class ItemDebug {

    public void init(Player commandSender){
        Player player = commandSender;

        try {
            String item = player.getItemInHand().toString();
            String itemType = player.getItemInHand().getType().toString();
            String itemMeta = player.getItemInHand().getItemMeta().toString();
            int itemAmount = player.getItemInHand().getAmount();
            int itemStack = player.getItemInHand().getMaxStackSize();

            player.sendMessage("///////////////////////////////////////");
            player.sendMessage("Item in hand: " + ChatColor.DARK_RED + item);
            player.sendMessage("Type of item: " + ChatColor.DARK_RED + itemType);
            player.sendMessage("Item MetaData: " + ChatColor.DARK_RED + itemMeta);
            player.sendMessage("Item Amount: " + ChatColor.DARK_RED + itemAmount);
            player.sendMessage("Item MaxStack: " + ChatColor.DARK_RED + itemStack);
            player.sendMessage("///////////////////////////////////////");
        } catch (Exception e) {player.sendMessage(ChatColor.DARK_RED +"Error has Occurred");}
    }


}
