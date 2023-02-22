package me.ratfarmer11.colachecks.checks.move;

import me.ratfarmer11.colachecks.checks.Category;
import me.ratfarmer11.colachecks.checks.Check;
import me.ratfarmer11.colachecks.checks.CheckManager;
import org.bukkit.Location;
import org.bukkit.event.player.PlayerMoveEvent;

public class IllegalMovement extends Check {
    public IllegalMovement() {
        super("IllegalMovement", Category.MOVE);
    }

    public void onMove(PlayerMoveEvent e) {

        Location from = e.getFrom();
        Location to = e.getTo();

        int lastPosX = from.getBlockX(),
                lastPosY = from.getBlockY(),
                lastPosZ = from.getBlockZ();

        int toPosX = to.getBlockX(),
                toPosY = to.getBlockY(),
                toPosZ = to.getBlockZ();

        float deltaX = lastPosX - toPosX, deltaZ = lastPosZ - toPosZ;
        float distance = (float) Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaZ, 2));

        System.out.println(e.getPlayer().getDisplayName()+" just moved "+distance+" blocks in one tick.");

        if(distance > 4) {
            CheckManager.flag(this.getName(), e.getPlayer().getDisplayName());
            e.setCancelled(true);
        }

        if(lastPosY == toPosY && !e.getPlayer().isFlying() && !e.getPlayer().isOnGround()) {
            e.to.setY(lastPosY-1);
        }

    }
}
