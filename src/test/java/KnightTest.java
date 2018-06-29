import Player.Fighters.Knight;
import Player.Fighters.Weapon;
import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Weapon sword, saber, axe, dagger;
    Orc orc;

    @Before
    public void setUp() throws Exception {
        dagger = new Weapon("dagger", 4);
        sword = new Weapon( "sword", 12);
        saber = new Weapon( "saber", 12);
        axe = new Weapon( "sword", 12);
        knight = new Knight("Greg", 100, sword, 50 );
        orc = new Orc("orc", 15, dagger);
    }

    @Test
    public void hasName() {
        assertEquals("Greg", knight.getName());
    }

    @Test
    public void hasLife() {
        assertEquals(100, knight.getHP());
    }

    @Test
    public void hasWeapon() {
        assertEquals( sword, knight.getWeapon());
    }

    @Test
    public void hasArmor() {
        assertEquals(50, knight.getArmour());
    }

    @Test
    public void canDamage() {
        knight.damage(orc);
        assertEquals(3, orc.getHP());
    }

    @Test
    public void canCollectAndChangeWeapon (){
        knight.collect(axe);
        assertEquals(axe, knight.getWeapon());
    }
}
