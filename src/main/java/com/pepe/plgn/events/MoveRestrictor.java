package com.pepe.plgn.events;
import org.bukkit.SoundCategory;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;

import static org.bukkit.Sound.BLOCK_ANVIL_FALL;

public class MoveRestrictor {
    public void init(Player player, PlayerMoveEvent e){
        if (!player.hasPermission("plgn.move")){
            e.setCancelled(true);
            player.playSound(player.getLocation(),BLOCK_ANVIL_FALL, SoundCategory.BLOCKS,5,5);
            player.sendMessage("ALPHA Testing: Currently you're not allowed to move");
        };
    }
}
