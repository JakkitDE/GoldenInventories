package de.tomstahlberg.goldeninventories;

import de.tomstahlberg.goldeninventories.tools.SettingsConfigurator;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.IOException;

public final class Main extends JavaPlugin {
    public static Plugin plugin;
    public static FileConfiguration settings;
    @Override
    public void onEnable() {
        plugin = this;
        // Plugin startup logic
        try {
            SettingsConfigurator settingsConfigurator = new SettingsConfigurator();
            settings = settingsConfigurator.getSettings();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    /*
    * permissions:
    * goldeninventories.group1.3 //set limit 3 inventories to worldgroup 1
    *
    * */
}
