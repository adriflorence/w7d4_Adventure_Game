package Player.Healers;
import Player.Player;
import Behaviours.IHeal;
import Locations.Treasure;

import java.util.ArrayList;

public class Cleric extends Player implements IHeal {

    ArrayList<Potion> healingStuff;

    public Cleric(String name, int HP) {
        super(name, HP);
        this.healingStuff = new ArrayList<Potion>();
    }

    public void addPotion(Potion potion) {
        healingStuff.add(potion);
    }

    public void heal(Player player, Potion potion) {
        if(healingStuff.contains(potion)) {
            int newHP = player.getHP() + potion.getHealingPoint();
            player.setHP(newHP);
            if (newHP > 100) {
                player.setHP(100);
            }
        }
    }

    public void collect(Treasure treasure) {
        if (treasure instanceof Potion) {
            healingStuff.add((Potion) treasure);
            System.out.println(this.getName() + "picked up a " + treasure.getName());
        }
    }
}
