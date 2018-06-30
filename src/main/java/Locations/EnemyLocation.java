package Locations;

import java.util.ArrayList;
import Enemy.Enemy;

public class EnemyLocation extends Location {

    ArrayList<Enemy> enemies;

    public EnemyLocation(String name, String description, ArrayList<Enemy> enemies) {
        super(name, description);
        this.enemies = enemies;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
}
