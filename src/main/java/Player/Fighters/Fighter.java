package Player.Fighters;
import Behaviours.IDamage;
import Enemy.Enemy;

import Player.Player;
import Locations.Treasure;

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

    public void collect(Treasure treasure) {
        if (treasure instanceof Weapon) {
            Weapon newWeapon = (Weapon)treasure;
            if (newWeapon.getHitpoint() > this.weapon.getHitpoint() ){
                this.weapon = newWeapon;
                System.out.println(this.getName() + " picked up a " + weapon.getName() + ", that has " + weapon.getHitpoint() + " hitpoints");
            }

        }
    }

}
