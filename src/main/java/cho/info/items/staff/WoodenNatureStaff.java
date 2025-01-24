package cho.info.items.staff;

import cho.info.utli.CustomTexture;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class WoodenNatureStaff extends GenericCustomItem {
    public WoodenNatureStaff(Plugin plugin) {
        super(plugin, "woodenNatureStaff", CustomTexture.getItemUrl("staff/wooden_nature_staff"));
        setName("Wooden Nature Staff");
        setStackable(false);
    }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {

        if (!player.isSpoutCraftEnabled()) return false;

        player.sendMessage("You clicked with the wooden nature staff!");

        return true;
    }
}
