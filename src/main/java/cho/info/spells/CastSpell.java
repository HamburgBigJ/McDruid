package cho.info.spells;

import org.getspout.spoutapi.player.SpoutPlayer;

public class CastSpell {

    public void castSpell(String spell, SpoutPlayer player) {

        if (spell == "thorne") {
            SimpleThorne simpleThorne = new SimpleThorne();
            simpleThorne.castThorne(player);
        } else if (spell == "thorne_fire") {
            FireThorne fireThorne = new FireThorne();
            fireThorne.castThorne(player);
        }

    }

}
