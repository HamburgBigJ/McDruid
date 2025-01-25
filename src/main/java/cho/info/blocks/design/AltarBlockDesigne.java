package cho.info.blocks.design;

import cho.info.utli.CustomTexture;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.SubTexture;
import org.getspout.spoutapi.block.design.Texture;



public class AltarBlockDesigne extends GenericBlockDesign {

    public AltarBlockDesigne(Plugin plugin, String url) {
        Texture texture = new Texture(plugin, url, 100,  100, 100);
        setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F).setQuadNumber(11);
        setTexture(plugin, texture.getTexture()).setMinBrightness(1.0f).setMinBrightness(1.0f);
        SubTexture subTex = texture.getSubTexture(1);
        SubTexture front = texture.getSubTexture(2);
        SubTexture back = texture.getSubTexture(3);
        SubTexture bottom = texture.getSubTexture(4);

        Quad bottom1 = new Quad(0, subTex);
        bottom1.addVertex(0, 0.25F, 0.02F, 0.875F);
        bottom1.addVertex(1, 0.75F, 0.02F, 0.875F);
        bottom1.addVertex(2, 0.75F, 0.02F, 0.125F);
        bottom1.addVertex(3, 0.25F, 0.02F, 0.125F);

        Quad bottom2 = new Quad(1, bottom);
        bottom2.addVertex(3, 0.25F, 0.0F, 0.875F);
        bottom2.addVertex(2, 0.75F, 0.0F, 0.875F);
        bottom2.addVertex(1, 0.75F, 0.0F, 0.125F);
        bottom2.addVertex(0, 0.25F, 0.0F, 0.125F);

        Quad left1 = new Quad(2, subTex);
        left1.addVertex(0, 0.25F, 0.0F, 0.125F);
        left1.addVertex(1, 0.75F, 0.0F, 0.125F);
        left1.addVertex(2, 0.75F, 0.5F, 0.125F);
        left1.addVertex(3, 0.25F, 0.5F, 0.125F);

        Quad left2 = new Quad(3, subTex);
        left2.addVertex(3, 0.25F, 0.0F, 0.125F);
        left2.addVertex(2, 0.75F, 0.0F, 0.125F);
        left2.addVertex(1, 0.75F, 0.5F, 0.125F);
        left2.addVertex(0, 0.25F, 0.5F, 0.125F);

        Quad back1 = new Quad(4, subTex);
        back1.addVertex(0, 0.75F, 0.0F, 0.125F);
        back1.addVertex(1, 0.75F, 0.0F, 0.875F);
        back1.addVertex(2, 0.75F, 0.5F, 0.875F);
        back1.addVertex(3, 0.75F, 0.5F, 0.125F);

        Quad back2 = new Quad(5, back);
        back2.addVertex(3, 0.75F, 0.0F, 0.125F);
        back2.addVertex(2, 0.75F, 0.0F, 0.875F);
        back2.addVertex(1, 0.75F, 0.5F, 0.875F);
        back2.addVertex(0, 0.75F, 0.5F, 0.125F);

        Quad right1 = new Quad(6, subTex);
        right1.addVertex(0, 0.25F, 0.0F, 0.875F);
        right1.addVertex(1, 0.75F, 0.0F, 0.875F);
        right1.addVertex(2, 0.75F, 0.5F, 0.875F);
        right1.addVertex(3, 0.25F, 0.5F, 0.875F);

        Quad right2 = new Quad(7, subTex);
        right2.addVertex(3, 0.25F, 0.0F, 0.875F);
        right2.addVertex(2, 0.75F, 0.0F, 0.875F);
        right2.addVertex(1, 0.75F, 0.5F, 0.875F);
        right2.addVertex(0, 0.25F, 0.5F, 0.875F);

        Quad front1 = new Quad(8, front);
        front1.addVertex(1, 0.25F, 0.0F, 0.125F);
        front1.addVertex(2, 0.25F, 0.0F, 0.875F);
        front1.addVertex(3, 0.25F, 0.5F, 0.875F);
        front1.addVertex(0, 0.25F, 0.5F, 0.125F);

        Quad top1 = new Quad(9, subTex);
        top1.addVertex(0, 0.75F, 0.5F, 0.125F);
        top1.addVertex(1, 0.75F, 0.5F, 0.875F);
        top1.addVertex(2, 0.25F, 0.5F, 0.875F);
        top1.addVertex(3, 0.25F, 0.5F, 0.125F);

        Quad top2 = new Quad(10, subTex);
        top2.addVertex(3, 0.75F, 0.5F, 0.125F);
        top2.addVertex(2, 0.75F, 0.5F, 0.875F);
        top2.addVertex(1, 0.25F, 0.5F, 0.875F);
        top2.addVertex(0, 0.25F, 0.5F, 0.125F);

        setQuad(bottom1).setQuad(bottom2).setQuad(left1).setQuad(left2).setQuad(right1).setQuad(right2);
    }


}

// This code is taken from the project: https://dev.bukkit.org/projects/rpgessentials?page=72#c565