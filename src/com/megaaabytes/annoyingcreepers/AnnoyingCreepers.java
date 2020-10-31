package com.megaaabytes.annoyingcreepers;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class AnnoyingCreepers extends JavaPlugin
{
    @Override
    public void onEnable() {
        Listener listener = new listener();
        getServer().getPluginManager().registerEvents(listener, this);
    }
}
