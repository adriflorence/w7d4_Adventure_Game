package Player.Magicians;

import Enemy.Enemy;

public class Wizard extends Magician {

    public Wizard(String name, int HP, int SP, Creature creature) {
        super(name, HP, SP, creature);
    }

    public void damage(Enemy enemy, Spell spell) {
        if (canCastSpell(spell)) {
            int newSP = getSP() - spell.getSpellpoint();
            setSP(newSP);
            int newHP = enemy.getHP() - spell.getHitpoint();
            enemy.setHP(newHP);
            System.out.printf("you used " + spell.getName() + " on the " + enemy.getName());
        } else {
            System.out.println("you don't have enough sp, try something else");
        }
    }

}
