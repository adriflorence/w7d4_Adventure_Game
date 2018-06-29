package Enemy;

import Player.Fighters.Weapon;
import Player.Magicians.Magician;
import Player.Player;

public abstract class Enemy {

    String name;
    int HP;
    Weapon weapon;

    public Enemy(String name, int HP, Weapon weapon) {
        this.name = name;
        this.HP = HP;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttackPoints() {
        return weapon.getHitpoint();
    }

    public void attack(Player player) {
        if(player instanceof Magician && ((Magician) player).hasCreature()){
            int newHP = ((Magician) player).getCreature().getHP() - getAttackPoints();
            ((Magician) player).getCreature().setHP(newHP);
        } else {
            int newHP = player.getHP() - getAttackPoints();
            player.setHP(newHP);
        }

    }
}

