package me.ratfarmer11.colachecks.checks;

import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;

public class Check {

    private String name;
    private Category category;

    public Check(String nm, Category c) {
        name = nm; category = c;
    }

    public void onCombat(PlayerInteractEntityEvent e) {}
    public void onMove(PlayerMoveEvent e) {}
    public void onPlace(BlockPlaceEvent e) {}

    public String getName() {return name;}

}
