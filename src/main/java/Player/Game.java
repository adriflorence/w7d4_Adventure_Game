package Player;
import Locations.Location;
import Locations.Treasure;
import Enemy.Enemy;

import java.util.ArrayList;

public class Game {

    ArrayList<Location> quest;
    Team team;


    public Game(ArrayList<Location> quest, Team team) {
        this.quest = quest;
        this.team = team;
    }

    public void playTurn(Team team, Location location) {
        System.out.println(location.getDescription());
        team.enterRoom(location);
    }

}
