package Player;

public abstract class Player {

    String name;
    protected int HP;

    public Player(String name, int HP) {
        this.name = name;
        this.HP = HP;
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
}
