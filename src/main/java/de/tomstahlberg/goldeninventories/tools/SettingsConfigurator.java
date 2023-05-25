package de.tomstahlberg.goldeninventories.tools;

import de.tomstahlberg.goldeninventories.Main;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SettingsConfigurator {
    private File settingsFile = new File(Main.plugin.getDataFolder(), "settings.yml");
    FileConfiguration settings;
    public SettingsConfigurator() throws IOException {
        if(!settingsFile.exists()){
            this.settings = new YamlConfiguration();

            List<String> worldNamesGroup1 = new ArrayList<>();
            worldNamesGroup1.add("world");

            List<String> worldNamesGroup2 = new ArrayList<>();
            worldNamesGroup2.add("world_nether");
            worldNamesGroup2.add("world_the_end");

            this.settings.set("worldgroups.group1", worldNamesGroup1);
            this.settings.set("worldgroups.group2", worldNamesGroup2);

            this.settings.save(this.settingsFile);
        }else{
            this.settings = YamlConfiguration.loadConfiguration(this.settingsFile);
        }
    }

    public FileConfiguration getSettings (){
        return this.settings;
    }
}
