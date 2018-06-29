import Player.Fighters.Weapon;
import Player.Healers.Potion;
import Locations.Treasure;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class TreasureLocationTest {

    ArrayList<Treasure> treasures;
    Weapon sword;
    Potion smallpotion;

    @Before
    public void setUp() {
        sword = new Weapon( "sword", 12);
        smallpotion = new Potion("red potion", 10);
        treasures = new ArrayList<Treasure>();
        treasures.add(sword);
        treasures.add(smallpotion);
    }

    @Test
    public void canPickUpTreasure(){

    }
}
