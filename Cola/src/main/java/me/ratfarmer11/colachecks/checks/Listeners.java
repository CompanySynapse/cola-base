package me.ratfarmer11.colachecks.checks;

import me.ratfarmer11.colachecks.ColaChecks;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Listeners implements Listener {

    @EventHandler
    public void listenCombat(PlayerInteractEntityEvent e) {
        ColaChecks.checkManager.onCombat(e);
    }

    @EventHandler
    public void listenMove(PlayerMoveEvent e) {
        ColaChecks.checkManager.onMove(e);
    }

    @EventHandler
    public void listenPlace(BlockPlaceEvent e) {
        ColaChecks.checkManager.onPlace(e);
    }

}
