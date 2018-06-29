import Player.Fighters.Knight;
import Player.Fighters.Weapon;
import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Orc orc;

    @Before
    public void setUp() throws Exception {
        knight = new Knight("Greg", 100, Weapon.SWORD, 50 );
        orc = new Orc("orc", 15);
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
        assertEquals( Weapon.SWORD, knight.getWeapon());
    }

    @Test
    public void hasArmor() {
        assertEquals(50, knight.getArmour());
    }

    @Test
    public void canDamage() {
        knight.damage(orc);
        assertEquals(5, orc.getHP());
    }

    @Test
    public void canChangeWeapon (){
        knight.changeWeapon(Weapon.AXE);
        assertEquals(Weapon.AXE, knight.getWeapon());
    }
}
