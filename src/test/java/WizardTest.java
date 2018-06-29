import Enemy.Orc;
import Player.Magicians.Creature;
import Player.Magicians.Spell;
import Player.Magicians.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Orc orc;
    Creature[] creatures;
    Creature creature, creature1;

    @Before
    public void setUp() throws Exception {
        creature = new Creature("DRAGON", 80, 10);
        creature1 = new Creature("WEREWOLF", 60, 8);
        wizard = new Wizard("Steve", 100, 20, creatures);
        orc = new Orc("Adri", 100);
    }

    @Test
    public void canSummonCreature() {
        wizard = new Wizard("Steve", 100, 2, creatures);
        wizard.summonCreature(creature);
        assertEquals(false, wizard.hasCreature());
        orc.attack(wizard);
        assertEquals(80, wizard.getHP());
    }

    @Test
    public void creatureProtects() {
        wizard.summonCreature(creature);
        orc.attack(wizard);
        assertEquals(60, creature.getHP());
        assertEquals(100, wizard.getHP());
    }

    @Test
    public void canCastSpell(){
        wizard.damage(orc, Spell.LIGHTNINGBOLT);
        assertEquals(60 ,orc.getHP());
        assertEquals(14, wizard.getSP());
    }

    @Test
    public void canChangeCreature() {
        wizard.summonCreature(creature);
        wizard.changeCreature(creature1);
        assertEquals(2, wizard.getSP());
    }
}
