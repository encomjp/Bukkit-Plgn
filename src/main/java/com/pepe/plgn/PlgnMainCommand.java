package com.pepe.plgn;

import com.pepe.plgn.commands.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlgnMainCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        Player player = (Player) commandSender;
try {
    if (strings[0].equalsIgnoreCase("Config")) {
        Konfig config = new Konfig(); // Config == Konfig cause of reserved key.
        config.init(player);
    } else if (strings[0].equalsIgnoreCase("heal")) {
        Heal heal = new Heal();
        heal.init(player);
    } else if (strings[0].equalsIgnoreCase("debug") && strings[1].equalsIgnoreCase("item")) {
        ItemDebug itemdebug = new ItemDebug();
        itemdebug.init(player);
    } else if (strings[0].equalsIgnoreCase("debug") && strings[1].equalsIgnoreCase("player")) {
        DebugPlayer debugPlayer = new DebugPlayer();
        debugPlayer.init(player);
    } else if (strings[0].equalsIgnoreCase("spawn") && strings[1].equalsIgnoreCase("mob")) {
        SpawnMob spawnMob = new SpawnMob();
        spawnMob.init(player, strings);
    }

} catch (Exception e){ player.sendMessage("Unknown command ");
}
        return false;
    }
}
