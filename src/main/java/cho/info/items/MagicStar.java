package cho.info.items;

import cho.info.utli.CustomTexture;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.material.item.GenericCustomItem;

public class MagicStar extends GenericCustomItem {

    public MagicStar(Plugin plugin) {
        super(plugin, "magicStar", CustomTexture.getItemUrl("items/magic_star"));
        setName("Magic Star");
        setStackable(false);
    }
}
