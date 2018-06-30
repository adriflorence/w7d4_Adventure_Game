package Locations;
import java.util.ArrayList;

public class TreasureLocation extends Location {

    ArrayList<Treasure> treasures;

    public TreasureLocation(String name, String description, ArrayList<Treasure> treasures) {
        super(name, description);
        this.treasures = treasures;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
