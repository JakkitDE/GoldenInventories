package de.tomstahlberg.goldeninventories.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerLeave implements Listener {

    @EventHandler
    public void onPlayerLeave(PlayerQuitEvent event){
        /*
        * perhaps, save inventories to config
        * */
    }
}
