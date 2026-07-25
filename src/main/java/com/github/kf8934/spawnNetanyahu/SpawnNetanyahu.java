package com.github.kf8934.spawnNetanyahu;

import org.bukkit.plugin.java.JavaPlugin;

public final class SpawnNetanyahu extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerCommand("netanyahu", new netanyahu());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
