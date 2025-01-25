package cho.info.blocks;

import cho.info.blocks.design.AltarBlockDesigne;
import cho.info.utli.CustomTexture;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.player.SpoutPlayer;
import org.getspout.spoutapi.sound.SoundEffect;

public class MagicAltar extends GenericCustomBlock {


    public MagicAltar(Plugin plugin) {
        super(plugin, "magicAltar", true, new AltarBlockDesigne(plugin, CustomTexture.getTexture("debug_texture")));
        setName("Magic Altar");
        setLightLevel(10);
        setHardness(4.0f);
        setStepSound(SoundEffect.ANVIL_LAND);
    }

    @Override
    public boolean onBlockInteract(World world, int x, int y, int z, SpoutPlayer player) {

        if (!player.isSpoutCraftEnabled()) return false;

        player.sendMessage("You clicked with the magic altar!");

        return true;
    }


}
