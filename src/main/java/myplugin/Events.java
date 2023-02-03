package myplugin;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Events implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent PlayerJoin) {
        PlayerJoin.setJoinMessage(PlayerJoin.getPlayer().getName() + " hello bro hehehe");
        System.out.println(PlayerJoin.getJoinMessage());
    }
}
