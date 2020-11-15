package com.pepe.plgn;
import com.pepe.plgn.commands.moderator;
import com.pepe.plgn.events.*;
import com.pepe.plgn.holograms.HologramListener;
import org.bukkit.*;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Plgn extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new PingListener(), this);
        Bukkit.getPluginManager().registerEvents(new ToggleListener(),this);
        Bukkit.getPluginManager().registerEvents(new HologramListener(this), this);
        Bukkit.getPluginManager().registerEvents(new BlockListener(), this);
        System.out.println("Plgn working 1.3 / PlayerLoc / Mov not allowed w. Perm / Egg Brutalizer / Joining Sound + Msg");
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
        getCommand("Plgn").setExecutor(new PlgnMainCommand());
        Bukkit.getPluginManager().registerEvents(this, this);                                                   // Eventhandler
        SpawnStand spawnstand = new SpawnStand();                                                                           // ArmorStand Event
        spawnstand.init(new Location(Bukkit.getWorld("World"), -653, 142, 243));// Init ArmorStand Event with Location
        ToggleListener togglelistener = new ToggleListener();


    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        MoveRestrictor moverestrictor = new MoveRestrictor();
        moverestrictor.init(player, e);
    }

    @EventHandler void onJoin(PlayerJoinEvent e) throws InterruptedException {
        Player player = e.getPlayer();
        OnJoin onjoin = new OnJoin();
        onjoin.welcome(player);
        onjoin.bossBar(player);
    }

    @EventHandler
    public void onThrow(PlayerEggThrowEvent e) {
        e.setHatching(false);
    }

    public void spawnHologram(Player player){
        ArmorStand stand = (ArmorStand) player.getWorld().spawnEntity(player.getLocation().add(0, 1.5, 0), EntityType.ARMOR_STAND);
        stand.setInvisible(false);
        stand.setCustomNameVisible(true);
        stand.setGravity(false);
        stand.setInvisible(true);
        stand.setCustomName( ChatColor.MAGIC + "Hologram Test");

    }

}
