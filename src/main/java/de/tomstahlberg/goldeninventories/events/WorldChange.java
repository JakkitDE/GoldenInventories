package de.tomstahlberg.goldeninventories.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

public class WorldChange implements Listener {

    @EventHandler
    public void onWorldChange(PlayerChangedWorldEvent event){
        /*
        * get worldgroup
        * load inventory
        * */
    }
}
