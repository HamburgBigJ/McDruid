package cho.info.items;

import cho.info.utli.CustomTexture;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.Item;
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

        player.openInventory(getInventory());

        return true;
    }

    public Inventory getInventory() {
        Inventory inventory = Bukkit.createInventory(null, 27, "§bSpell Book");

        ItemStack thorne = new ItemStack(Material.ARROW);
        ItemMeta thorenMeta = thorne.getItemMeta();
        thorenMeta.setDisplayName("§3Thorne spell - Click to select");
        thorne.setItemMeta(thorenMeta);
        inventory.setItem(0, thorne);

        ItemStack sword = new ItemStack(Material.ARROW);
        ItemMeta swordMeta = sword.getItemMeta();
        swordMeta.setDisplayName("§4Fire Thorne spell - Click to select");
        sword.setItemMeta(swordMeta);
        inventory.setItem(1, sword);

        return inventory;
    }
}
