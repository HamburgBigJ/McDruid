package cho.info.items.staff;

import cho.info.McDruid;
import cho.info.spells.CastSpell;
import cho.info.utli.CustomTexture;
import cho.info.utli.PlayerData;
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

        PlayerData playerData = McDruid.getPlayerData();
        CastSpell castSpell = new CastSpell();
        castSpell.castSpell( (String) playerData.getPlayerValue(player, "spell"),player);

        return true;
    }
}
