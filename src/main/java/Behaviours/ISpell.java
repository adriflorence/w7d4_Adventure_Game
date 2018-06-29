package Behaviours;
import Enemy.Enemy;
import Player.Magicians.Spell;

public interface ISpell {

    void damage(Enemy enemy, Spell spell);
}
