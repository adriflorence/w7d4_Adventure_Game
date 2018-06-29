package Player.Magicians;

import Enemy.Enemy;

public class Warlock extends Magician {

    public Warlock(String name, int HP, int SP, Creature[] creatures) {
        super(name, HP, SP, creatures);
    }

    public void damage(Enemy enemy, Spell spell) {
        if (canCastSpell(spell)) {
            int newHP = enemy.getHP() - spell.getHitpoint();
            enemy.setHP(newHP);
            System.out.printf("you used %s on the %s", spell.getName(), enemy.getName());
        } else {
            System.out.println("you don't have enough sp, try something else");
        }
    }
}
