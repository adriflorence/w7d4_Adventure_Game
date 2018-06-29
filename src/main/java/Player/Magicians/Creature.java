package Player.Magicians;

public class Creature {

    String name;
    int HP;
    int pointsToSummon;

    public Creature(String name, int HP, int pointsToSummon) {
        this.name = name;
        this.HP = HP;
        this.pointsToSummon = pointsToSummon;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return HP;
    }

    public int getPointsToSummon() {
        return pointsToSummon;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }



}
