package Player.Healers;
import Locations.Treasure;

public class Potion extends Treasure {

    int healingPoint;

    public Potion(String name, int healingPoint) {
        super(name);
        this.healingPoint = healingPoint;
    }

    public int getHealingPoint() {
        return healingPoint;
    }
}
