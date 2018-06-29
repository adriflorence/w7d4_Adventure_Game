package Player.Healers;
import Player.Player;
import Behaviours.IHeal;

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
}
