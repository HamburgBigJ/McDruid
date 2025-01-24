package cho.info.items.staff;

import cho.info.utli.CustomTexture;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class StarForgedNatureStaff extends GenericCustomItem {

    public StarForgedNatureStaff(Plugin plugin) {
        super(plugin, "starForgedStaff", CustomTexture.getTexture("staff/starforged_nature_staff"));
        setName("Star Forged Staff");
        setStackable(false);
    }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {

        if (!player.isSpoutCraftEnabled()) return false;

        player.sendMessage("You clicked with the star forged staff!");

        return true;
    }
}
