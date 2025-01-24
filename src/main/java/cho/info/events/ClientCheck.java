package cho.info.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.getspout.spoutapi.player.SpoutPlayer;

public class ClientCheck implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        SpoutPlayer spoutPlayer = (SpoutPlayer) event.getPlayer();
        if (!spoutPlayer.isOnline()) {
            event.getPlayer().kickPlayer("§6You need to have the Spoutcraft client to play on this server!");
        }
    }

}
