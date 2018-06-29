package Player.Fighters;
import Behaviours.IDamage;
import Enemy.Enemy;

import Player.Player;

public abstract class Fighter extends Player implements IDamage {

    Weapon weapon;
    int armour;

    public Fighter(String name, int HP, Weapon weapon, int armour) {
        super(name, HP);
        this.weapon = weapon;
        this.armour = armour;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getArmour() {
        return armour;
    }

    public void damage(Enemy enemy) {
        int newHP = enemy.getHP() - weapon.getHitpoint();
        enemy.setHP(newHP);
    }

    public void changeWeapon(Weapon newWeapon) {
        this.weapon = newWeapon;
    }

}
