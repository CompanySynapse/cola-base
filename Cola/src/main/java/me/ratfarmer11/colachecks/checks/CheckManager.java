package me.ratfarmer11.colachecks.checks;

import me.ratfarmer11.colachecks.checks.move.IllegalMovement;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;

public class CheckManager {

    private static ArrayList<Check> checks;

    public CheckManager() {
        checks = new ArrayList<Check>();
        // Movement
        newCheck(new IllegalMovement());
    }

    public void newCheck(Check c) { checks.add(c); }
    public static ArrayList<Check> getChecks() { return checks; }

    public static void flag(String nm, String player) {
        System.out.println("§4[§0§lCola§r§4] §r§fPlayer §l§4"+player+" §rfailed §l§4"+nm);
    }

    public void onCombat(PlayerInteractEntityEvent e) {
        for(Check c: checks) {
            c.onCombat(e);
        }
    }
    public void onMove(PlayerMoveEvent e) {
        for(Check c: checks) {
            c.onMove(e);
        }
    }
    public void onPlace(BlockPlaceEvent e) {
        for(Check c: checks) {
            c.onPlace(e);
        }
    }

}
