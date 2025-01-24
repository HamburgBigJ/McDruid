package cho.info.music;

import cho.info.utli.CustomTexture;
import org.bukkit.Location;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.packet.PacketDownloadMusic;

public class GameMusic extends PacketDownloadMusic {

    public GameMusic(Plugin plugin) {
        Location loc = plugin.getServer().getWorlds().get(0).getSpawnLocation();
        super("hello", CustomTexture.getSound("ambiente/ambitio"), loc, 10, 10, true, false);
    }

}
