package cho.info.blocks;

import cho.info.utli.CustomTexture;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericCubeBlockDesign;
import org.getspout.spoutapi.material.block.GenericCustomBlock;
import org.getspout.spoutapi.sound.SoundEffect;

public class MagicWood extends GenericCustomBlock {
    public MagicWood(Plugin plugin) {
        super(plugin, "magicWood", true, new GenericCubeBlockDesign(plugin, CustomTexture.getTexture("blocks/magic_wood"), 16));
        setHardness(3.0f);
        setName("Magic Wood");
        setStepSound(SoundEffect.STEP_WOOD);
    }

}
