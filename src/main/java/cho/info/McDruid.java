package cho.info;

import cho.info.blocks.MagicAltar;
import cho.info.blocks.MagicWood;
import cho.info.events.ClientCheck;
import cho.info.items.DruidSpellBook;
import cho.info.items.MagicStar;
import cho.info.items.staff.IronNatureStaff;
import cho.info.items.staff.StarForgedNatureStaff;
import cho.info.items.staff.WoodenNatureStaff;
import cho.info.utli.HttpServer;
import org.bukkit.Material;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.inventory.SpoutItemStack;
import org.getspout.spoutapi.inventory.SpoutShapedRecipe;
import org.getspout.spoutapi.inventory.SpoutShapelessRecipe;
import org.getspout.spoutapi.material.MaterialData;

public class McDruid extends JavaPlugin {

    private static McDruid instance;

    public DruidSpellBook druidSpellBook;
    public WoodenNatureStaff woodenNatureStaff;
    public StarForgedNatureStaff starForgedNatureStaff;
    public IronNatureStaff ironNatureStaff;
    public MagicStar magicStar;

    public MagicWood magicWood;
    public MagicAltar magicAltar;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        HttpServer httpServer = new HttpServer();
        httpServer.startHttpServer();

        // Items
        druidSpellBook = new DruidSpellBook(this);
        woodenNatureStaff = new WoodenNatureStaff(this);
        starForgedNatureStaff = new StarForgedNatureStaff(this);
        ironNatureStaff = new IronNatureStaff(this);
        magicStar = new MagicStar(this);

        // Blocks
        magicWood = new MagicWood(this);
        magicAltar = new MagicAltar(this);


        PluginManager pluginManager = getServer().getPluginManager();
        pluginManager.registerEvents(new ClientCheck(), this);


        loadRecepies();


    }

    @Override
    public void onDisable() {
        HttpServer httpServer = new HttpServer();
        httpServer.stopHttpServer();
    }

    public static McDruid getInstance() {
        return instance;
    }

    public void loadRecepies() {
        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(woodenNatureStaff, 1))
                        .shape(
                                "  W", " S ", "E  "
                        )
                        .setIngredient('W', magicWood)
                        .setIngredient('S', MaterialData.stick)
                        .setIngredient('E', MaterialData.emerald)
        );

        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(magicWood, 8))
                        .shape(
                                "WWW", "WSW", "WWW"
                        )
                        .setIngredient('W', MaterialData.wood)
                        .setIngredient('S', magicStar)
        );

        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(ironNatureStaff, 1))
                        .shape(
                                " I ", "ISI", " I "
                        )
                        .setIngredient('I', MaterialData.ironIngot)
                        .setIngredient('S', woodenNatureStaff)
        );

        SpoutManager.getMaterialManager().registerSpoutRecipe(
                new SpoutShapedRecipe(new SpoutItemStack(starForgedNatureStaff, 1))
                        .shape(
                                " S ", "SIS", " S "
                        )
                        .setIngredient('I', ironNatureStaff)
                        .setIngredient('S', magicStar)
        );
        SpoutManager.getMaterialManager().registerSpoutRecipe((
                new SpoutShapelessRecipe(new SpoutItemStack(druidSpellBook, 4)))
                .addIngredient(1, MaterialData.book)
                .addIngredient(1, MaterialData.vines)
                .addIngredient(1, magicStar)
        );

    }

}
