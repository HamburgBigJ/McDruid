package cho.info.ui;

import cho.info.McDruid;
import cho.info.utli.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class SpellBookUi implements Listener {

    @EventHandler
    public void onIntentoryCliek(InventoryClickEvent event) {
        if (event.getInventory().getName().equals("§bSpell Book")) {
            PlayerData playerData = McDruid.getPlayerData();
            Player player = (Player) event.getWhoClicked();

            if (event.getCurrentItem().getItemMeta().getDisplayName() == "§3Thorne spell - Click to select") {
                playerData.setPlayerValue(player, "spell", "thorne");
            } else if (event.getCurrentItem().getItemMeta().getDisplayName() == "§4Fire Thorne spell - Click to select") {
                playerData.setPlayerValue(player, "spell", "thorne_fire");
            }

            event.setCancelled(true);
        }
    }

}
