package Player.Magicians;
import Behaviours.ISpell;
import Enemy.Enemy;
import Player.Player;

public abstract class Magician extends Player implements ISpell {

    int SP; // 20/20
    Creature[] creatures;
    Magician magician;
    Spell spell;
    int level;

    public Magician(String name, int HP, int SP, Creature[] creatures) {
        super(name, HP);
        this.SP = SP;
        this.creatures = new Creature[1];
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
            System.out.println("You don't have enough spell point, try something else!");
        }
    }

    public Creature[] getCreatures() {
        return creatures;
    }

    public boolean hasCreature() {
        return (creatures[0] != null);
    }

    public void summonCreature(Creature creature) {
        if (this.SP >= creature.pointsToSummon) {
            creatures[0] = creature; // adds cr to list
            int newSP = this.SP - creature.pointsToSummon;
            setSP(newSP);
        }
    }

    public void unsummonCreature(Creature creature) {
        creatures[0] = null;
    }

    public void changeCreature(Creature newCreature) {
        if (this.SP >= newCreature.pointsToSummon) {
            creatures[0] = newCreature;
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
