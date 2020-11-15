package com.pepe.plgn.holograms;

import com.pepe.plgn.Plgn;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

public class HologramListener implements Listener {

    private Plgn plgn;

    public HologramListener(Plgn plgn) {
        this.plgn = plgn;
    }

    @EventHandler
    public void onEggThrow(PlayerEggThrowEvent e) {

        Player player = e.getPlayer();
        plgn.spawnHologram(player);

    }
}
