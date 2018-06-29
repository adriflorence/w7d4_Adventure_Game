package Player.Magicians;
import Behaviours.ISpell;
import Enemy.Enemy;
import Player.Player;

public abstract class Magician extends Player implements ISpell {

    int SP; // 20/20
    Creature creature;
    Magician magician;
    Spell spell;
    int level;

    public Magician(String name, int HP, int SP, Creature creature) {
        super(name, HP);
        this.SP = SP;
        this.creature = creature;
        this.level = 1;
    }

    public boolean canCastSpell(Spell spell) {
        return (this.level >= spell.getLevel());
    }

    public void damage(Enemy enemy, Spell spell) {
        if (canCastSpell(spell)) {
            int newHP = enemy.getHP() - spell.getHitpoint();
            enemy.setHP(newHP);
        } else {
            System.out.println("You don't have enough spell points, try something else!");
        }
    }

    public Creature getCreature() {
        return creature;
    }

    public boolean hasCreature() {
        return (creature != null);
    }

    public void summonCreature(Creature creature) {
        if (this.SP >= creature.pointsToSummon) {
            this.creature = creature; // adds cr to list
            int newSP = this.SP - creature.pointsToSummon;
            setSP(newSP);
        }
    }

    public void unsummonCreature(Creature creature) {
        creature = null;
    }

    public void changeCreature(Creature newCreature) {
        if (this.SP >= newCreature.pointsToSummon) {
            creature = newCreature;
            int newSP = this.SP - newCreature.pointsToSummon;
            setSP(newSP);
        }
    }

    public int getSP() {
        return SP;
    }

    public void setSP(int SP) {
        this.SP = SP;
    }
}
