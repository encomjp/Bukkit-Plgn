package com.pepe.plgn.events;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.util.CachedServerIcon;

import javax.swing.*;
import java.io.File;

public class PingListener implements Listener {

    @EventHandler
    public void onPing(ServerListPingEvent e){
        e.setMaxPlayers(1337);

        e.setMotd(StringUtils.center(ChatColor.MAGIC + ".!"  + ChatColor.RESET + ChatColor.GREEN + "EuropeanPepe's Crazy Laboratory" + ChatColor.RESET + ChatColor.BOLD +  ChatColor.MAGIC + "!." + "\n"
                + ChatColor.RESET + ChatColor.DARK_AQUA + ChatColor.BOLD +  "!Welcome!", 20));
        try {
            e.setServerIcon(Bukkit.loadServerIcon(new File("rare-pepe.jpg")));
        } catch (Exception e1){
            e1.printStackTrace();
        }


    }
}
