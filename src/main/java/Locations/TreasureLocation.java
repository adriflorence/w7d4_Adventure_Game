package Locations;
import java.util.ArrayList;

public class TreasureLocation extends Location {

    ArrayList<Treasure> treasures;

    public TreasureLocation(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
