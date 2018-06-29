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

//    OGRE(50, "ogre"),
//    FLAILSNAIL(1000, "flail snail"),
//    DRAGON(80, "dragon"),
//    TROLL(60, "troll"),
//    GRIFFIN(70, "griffin"),
//    WEREWOLF(70, "werewolf")

}
