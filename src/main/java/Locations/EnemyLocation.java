package Locations;

import java.util.ArrayList;
import Enemy.Enemy;

public class EnemyLocation extends Location {

    ArrayList<Enemy> enemies;

    public EnemyLocation(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }
}
