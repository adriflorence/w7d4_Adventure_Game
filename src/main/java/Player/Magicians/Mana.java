package Player.Magicians;

import Locations.Treasure;

public class Mana extends Treasure {

    final int value;

    public Mana(String name, int value) {
        super(name);
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
