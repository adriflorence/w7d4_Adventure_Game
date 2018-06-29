package Player.Fighters;

public enum Weapon {

    SWORD(10, "sword"),
    AXE(50, "axe"),
    CLUB(30, "club"),
    SPEAR(10, "speak");

    private final int hitpoint;
    private final String name;

    Weapon(int hitpoint, String name) {
        this.hitpoint = hitpoint;
        this.name = name;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public String getName() {
        return name;
    }

}
