package cho.info.items;

import cho.info.utli.CustomTexture;
import org.bukkit.block.BlockFace;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

public class DruidSpellBook extends GenericCustomItem {
    public DruidSpellBook(Plugin plugin) {
        super(plugin, "woodenSpellBook", CustomTexture.getTexture("spell/druids_spell_book"));
        setName("Spell Book");
        setStackable(false);
    }

    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face) {

        if (!player.isSpoutCraftEnabled()) return false;

        player.sendMessage("You clicked with the spell book!");

        return true;
    }
}
