import Enemy.Orc;
import Player.Fighters.Weapon;
import Player.Magicians.Creature;
import Player.Magicians.Spell;
import Player.Magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Orc orc;
    Creature dragon, werewolf;
    Weapon club;

    @Before
    public void setUp() throws Exception {
        club = new Weapon("club", 12);
        wizard = new Wizard("Steve", 100, 100, 100, null);
        dragon = new Creature("Red Dragon", 100, 18);
        werewolf = new Creature("werewolf", 80, 14);
        orc = new Orc("Adri", 100, club);
    }

    @Test
    public void canSummonCreature() {
        wizard.summonCreature(dragon);
        assertEquals(true, wizard.hasCreature());
        assertEquals(82, wizard.getSP());
    }

    @Test
    public void cannotAffordCreature() {
        wizard = new Wizard("Steve", 100, 2, 100, null);
        wizard.summonCreature(werewolf);
        assertEquals(false, wizard.hasCreature());
        orc.attack(wizard);
        assertEquals(88, wizard.getHP());
    }

    @Test
    public void creatureProtects() {
        wizard.summonCreature(werewolf);
        orc.attack(wizard);
        assertEquals(68, werewolf.getHP());
        assertEquals(100, wizard.getHP());
    }

    @Test
    public void canCastSpell(){
        wizard.damage(orc, Spell.LIGHTNINGBOLT);
        assertEquals(60 ,orc.getHP());
        assertEquals(94, wizard.getSP());
    }

    @Test
    public void canChangeCreature() {
        wizard.summonCreature(werewolf); // 14 SP
        wizard.changeCreature(dragon); // 18 SP
        assertEquals(dragon, wizard.getCreature());
        assertEquals(68, wizard.getSP());
    }
}
