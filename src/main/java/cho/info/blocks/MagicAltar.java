package cho.info.blocks;

import cho.info.McDruid;
import cho.info.blocks.design.AltarBlockDesigne;
import cho.info.items.staff.StarForgedNatureStaff;
import cho.info.utli.CustomTexture;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.getspout.spoutapi.sound.SoundEffect;

import java.util.Objects;

public class MagicAltar extends GenericCustomBlock {


    public MagicAltar(Plugin plugin) {
        super(plugin, "magicAltar", true, new GenericCubeBlockDesign(plugin, CustomTexture.getTexture("blocks/magic_altar"), 16));
        setName("Magic Altar");
        setLightLevel(10);
        setHardness(4.0f);
        setStepSound(SoundEffect.ANVIL_LAND);
    }

    @Override
    public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {

        if (!player.isSpoutCraftEnabled()) return false;

        /** not working
        McDruid mcDruid = McDruid.getInstance();

        if (Objects.equals(player.getInventory().getItemInHand().getItemMeta().getDisplayName(), mcDruid.getIronNatureStaff().getName())) {

            Location block_1 = new Location(world, x, y - 2, z);
            Location block_2 = new Location(world, x, y + 2, z);
            Location block_3 = new Location(world, x - 2, y, z);
            Location block_4 = new Location(world, x + 2, y, z);
            if (block_1.getBlock().getType() == Material.DIAMOND_BLOCK && block_2.getBlock().getType() == Material.DIAMOND_BLOCK && block_3.getBlock().getType() == Material.DIAMOND_BLOCK && block_4.getBlock().getType() == Material.DIAMOND_BLOCK) {
                block_1.getBlock().setType(Material.AIR);
                block_2.getBlock().setType(Material.AIR);
                block_3.getBlock().setType(Material.AIR);
                block_4.getBlock().setType(Material.AIR);
                player.getInventory().getItemInHand().setType(Material.AIR);
                player.getInventory().addItem(new SpoutItemStack(mcDruid.getStarForgedNatureStaff()));

                return true;

            }

        } else return false;


         **/


        return true;
    }


}
