package Player;
import Locations.Location;
import Locations.Treasure;
import Enemy.Enemy;

import java.util.ArrayList;

public class Game {

    ArrayList<Location> quest;
    ArrayList<Treasure> treasure;
    ArrayList<Enemy> enemies;
    Team team;


    public Game(ArrayList<Location> quest, ArrayList<Treasure> treasure, ArrayList<Enemy> enemies, Team team) {
        this.quest = quest;
        this.treasure = treasure;
        this.enemies = enemies;
        this.team = team;
    }

    public void playTurn(Team team, Location location) {
        team.enterRoom(location);
    }

}
