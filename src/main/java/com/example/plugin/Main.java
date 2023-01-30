package com.example.plugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.LogPrefix;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name = "ExamplePlugin", version = "1.0")
public final class Main extends JavaPlugin {
    @Override
    public void onLoad() { }

    @Override
    public void onEnable() { }

    @Override
    public void onDisable() { }
}
