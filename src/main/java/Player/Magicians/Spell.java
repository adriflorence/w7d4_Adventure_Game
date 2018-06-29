package Player.Magicians;

public enum Spell {

    //levels
    FIREBALL(1, 30, 5, "fireball"),
    LIGHTNINGBOLT(1, 40, 6, "lightning bolt"),
    BLINK(1, 0, 0, "blink"),

    ACIDRAIN(2, 60, 8, "acid rain"),
    EARTHQUAKE(2, 70, 9, "earth quake"),
    LAVA(2, 75, 10, "lavaaaaa"),

    METEOR(3, 70, 6, "meteor"),
    THUNDERSTORM(3, 40, 5, "thunder storm"),
    HORRIDWILTING(3, 60, 6, "Abi-Dalzim's Horrid wilting");


    private final int level;
    private final int hitpoint;
    private final int spellpoint;
    private final String name;

    Spell(int level, int hitpoint, int spellpoint, String name) {
        this.level = level;
        this.hitpoint = hitpoint;
        this.spellpoint = spellpoint;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public int getSpellpoint() {
        return spellpoint;
    }

    public String getName() {
        return name;
    }
}
