package dev.necr.respawngui;

import dev.necr.respawngui.listeners.PlayerRespawnListener;

import lombok.Getter;

import org.bukkit.plugin.java.JavaPlugin;

@SuppressWarnings({"UnstableApiUsage", "unused"})
public final class RespawnGUI extends JavaPlugin {

    @Getter
    private static RespawnGUI instance;

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getServer().getPluginManager().registerEvents(new PlayerRespawnListener(this), this);
        this.getLogger().info("Registered PlayerRespawnListener!");

        this.getLogger().info("Enabled RespawnGUI by " + this.getPluginMeta().getAuthors());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        this.getLogger().info("Disabling RespawnGUI by " + this.getPluginMeta().getAuthors());

        this.getLogger().info("Disabled RespawnGUI by " + this.getPluginMeta().getAuthors());
    }
}
