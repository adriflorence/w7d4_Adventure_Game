package Player.Fighters;

import Locations.Treasure;

public class Weapon extends Treasure {

//    SWORD(10, "sword"),
//    AXE(50, "axe"),
//    CLUB(30, "club"),
//    SPEAR(10, "speak");

    private int hitpoint;

    public Weapon(String name, int hitpoint) {
        super(name);
        this.hitpoint = hitpoint;
    }

    public int getHitpoint() {
        return hitpoint;
    }


}
