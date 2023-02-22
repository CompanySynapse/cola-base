package me.ratfarmer11.colachecks;

import me.ratfarmer11.colachecks.checks.CheckManager;
import org.bukkit.plugin.java.JavaPlugin;
import me.ratfarmer11.colachecks.checks.Listeners;

public final class ColaChecks extends JavaPlugin {

    public static CheckManager checkManager;

    @Override
    public void onEnable() {
        // Plugin startup logic
        checkManager = new CheckManager();
        //Register Listeners
        getServer().getPluginManager().registerEvents(new Listeners(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
