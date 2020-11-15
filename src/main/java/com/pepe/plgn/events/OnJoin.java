package com.pepe.plgn.events;

import com.pepe.plgn.Plgn;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.concurrent.TimeUnit;

public class OnJoin {

    BossBar bossBar;

    public void welcome(Player player){
        player.sendMessage(ChatColor.DARK_GRAY +"Welcome " + ChatColor.BOLD + player.getName() +  ChatColor.RESET + ChatColor.DARK_GRAY + " to The " + ChatColor.BOLD + ChatColor.DARK_RED + " THE PEPE TEST CHAMBERS!");
        player.playSound(player.getLocation(), Sound.BLOCK_ANVIL_LAND, 1, 0);
    }

    public void bossBar(Player player) throws InterruptedException {
        bossBar = Bukkit.createBossBar(
                ChatColor.BOLD + "" + ChatColor.BLUE + "Pepe's Lab 1.0",
                BarColor.BLUE,
                BarStyle.SOLID,
                BarFlag.PLAY_BOSS_MUSIC);
        bossBar.addPlayer(player);
    }
}
