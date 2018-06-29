package Enemy;

import Player.Magicians.Magician;
import Player.Player;

public abstract class Enemy {

    String name;
    int HP;
    int attackPoints;

    public Enemy(String name, int HP) {
        this.name = name;
        this.HP = HP;
        this.attackPoints = 20;
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
        return attackPoints;
    }

    public void attack(Player player) {
        if(player instanceof Magician && ((Magician) player).hasCreature()){
            int newHP = ((Magician) player).getCreatures()[0].getHP() - getAttackPoints();
            ((Magician) player).getCreatures()[0].setHP(newHP);
        } else {
            int newHP = player.getHP() - getAttackPoints();
            player.setHP(newHP);
        }

    }
}

