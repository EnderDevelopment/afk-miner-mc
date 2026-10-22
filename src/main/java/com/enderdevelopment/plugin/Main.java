package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("AFK Miner plugin enabled!");
        this.getCommand("afkminer").setExecutor(new AFKMinerCommand());
    }

    @Override
    public void onDisable() {
        getLogger().info("AFK Miner plugin disabled!");
    }
}