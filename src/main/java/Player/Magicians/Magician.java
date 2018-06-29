package Player.Magicians;
import Behaviours.ISpell;
import Enemy.Enemy;
import Player.Player;
import Locations.Treasure;

import java.util.ArrayList;

public abstract class Magician extends Player implements ISpell {

    int SP;             // 20
    final int maxSP;    // 100
    Creature creature;
    Spell spell;
    int level;
    ArrayList<Mana> manas;

    public Magician(String name, int HP, int SP, int maxSP, Creature creature) {
        super(name, HP);
        this.SP = SP;
        this.maxSP = maxSP;
        this.creature = creature;
        this.level = 1;
        this.manas = new ArrayList<Mana>();
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

    public void takeMana(Mana mana) {
        if(SP + mana.getValue() >= maxSP) {
            this.SP = maxSP;
        } else {
            this.SP += mana.getValue();
        }
    }

    public void collect(Treasure treasure) {
        // sets max number of manas at 5
        if ((treasure instanceof Mana) && (manas.size() <= 5)){
            manas.add((Mana)treasure);
            System.out.println(this.getName() + "picked up a mana.");
        } else {
            System.out.println("you have no more space for manas. gotta have to leave this one.");
        }

    }
}
