package cho.info.spells;

import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.util.Vector;
import org.getspout.spoutapi.player.SpoutPlayer;

public class SimpleThorne {

    public void castThorne(SpoutPlayer player) {
        Location loc = player.getLocation();
        Vector direction = loc.getDirection();

        Arrow arrow = player.getWorld().spawnArrow(
                loc.add(0, 1.5, 0),
                direction,
                1.5f,
                12.0f
        );
        arrow.setShooter(player);

    }

}
