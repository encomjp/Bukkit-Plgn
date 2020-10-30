package com.pepe.plgn;
import com.pepe.plgn.events.MoveRestrictor;
import com.pepe.plgn.events.OnJoin;
import com.pepe.plgn.events.SpawnStand;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Sound.BLOCK_ANVIL_FALL;

public final class Plgn extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        System.out.println("Plgn working 1.3 / PlayerLoc / Mov not allowed w. Perm / Egg Brutalizer / Joining Sound + Msg");
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("Plgn").setExecutor(new PlgnMainCommand());                                                          // Main CommandHandler
        Bukkit.getPluginManager().registerEvents(this, this);                                                   // Eventhandler
        SpawnStand spawnstand = new SpawnStand();                                                                           // ArmorStand Event
        spawnstand.init(new Location(Bukkit.getWorld("World"), -653, 142, 243));                                // Init ArmorStand Event with Location
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public void editConfig() {

        this.getConfig().set("Word", "Hello Apple");
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        MoveRestrictor moverestrictor = new MoveRestrictor();
        moverestrictor.init(player, e);
    }

    @EventHandler void onJoin(PlayerJoinEvent e){
        Player player = e.getPlayer();
        OnJoin onjoin = new OnJoin();
        onjoin.init(player);
    }

    @EventHandler
    public void onThrow(PlayerEggThrowEvent e) {
        Player player = e.getPlayer();
        e.setHatching(false);

    }

}