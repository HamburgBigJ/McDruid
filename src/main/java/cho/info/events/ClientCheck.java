package cho.info.events;

import cho.info.McDruid;
import cho.info.utli.PlayerData;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.getspout.spoutapi.player.SpoutPlayer;

public class ClientCheck implements Listener {

    public McDruid mcDruid;

    public ClientCheck(McDruid mcDruid) {
        this.mcDruid = mcDruid;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        SpoutPlayer spoutPlayer = (SpoutPlayer) event.getPlayer();
        if (!mcDruid.getConfig().getBoolean("requiresSpoutClient")) return;
        if (!spoutPlayer.isOnline()) {
            event.getPlayer().kickPlayer("§6You need to have the Spoutcraft client to play on this server!");
        }
        if (event.getPlayer().hasPlayedBefore()) {
            PlayerData playerData = McDruid.getPlayerData();

            playerData.addValue(event.getPlayer(), "spell", "thorne");
        }
    }

}
