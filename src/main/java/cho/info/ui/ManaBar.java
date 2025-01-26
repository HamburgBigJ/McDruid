package cho.info.ui;

import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.gui.*;

public class ManaBar extends GenericWidget {

    public ManaBar(Plugin plugin) {
        super(100, 100, 200, 200);
        setPlugin(plugin);
        setVisible(true);
        setAnchor(WidgetAnchor.BOTTOM_LEFT);

    }

    @Override
    public WidgetType getType() {
        return WidgetType.InGameScreen;
    }
}
// not complete