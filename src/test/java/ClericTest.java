import Player.Fighters.Knight;
import Player.Fighters.Weapon;
import Player.Healers.Cleric;
import Player.Healers.Potion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Knight knight;
    Cleric cleric;
    Potion potion, largepotion;
    Weapon sword;

    @Before
    public void setUp() throws Exception {
        sword = new Weapon("sword", 12);
        knight = new Knight("Adri", 80, sword, 50);
        cleric = new Cleric("Father Greg", 100);
        potion = new Potion("red potion", 10);
        largepotion = new Potion("large potion", 50);
    }

    @Test
    public void canHeal() {
        cleric.addPotion(potion);
        cleric.heal(knight, potion);
        assertEquals(90, knight.getHP());
    }

    @Test
    public void cannotHealBeyondMax() {
        cleric.addPotion(largepotion);
        cleric.heal(knight, largepotion);
        assertEquals(100, knight.getHP());
    }
}