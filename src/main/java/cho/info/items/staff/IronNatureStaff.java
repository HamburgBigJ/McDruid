package cho.info.items.staff;

import cho.info.utli.CustomTexture;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class IronNatureStaff extends GenericCustomItem {
    public IronNatureStaff(Plugin plugin) {
        super(plugin, "ironNatureStaff", CustomTexture.getItemUrl("staff/iron_nature_staff"));
        setName("Iron Nature Staff");
        setStackable(false);
    }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {

        if (!player.isSpoutCraftEnabled()) return false;

        player.sendMessage("You clicked with the iron nature staff!");

        return true;
    }
}
