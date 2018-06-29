package Player.Healers;

public class Potion {

    String name;
    int healingPoint;

    public Potion(String name, int healingPoint) {
        this.name = name;
        this.healingPoint = healingPoint;
    }

    public String getName() {
        return name;
    }

    public int getHealingPoint() {
        return healingPoint;
    }
}
