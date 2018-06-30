package Player;

import Enemy.Enemy;
import Locations.EnemyLocation;
import Locations.Location;
import Locations.Treasure;
import Locations.TreasureLocation;

import java.util.ArrayList;

public class Team {

    Player[] team;
    Gold gold;
    int exp;

    public Team() {
        team = new Player[3];
//        gold = new Gold("gold", 100);
    }

    public void addPlayers(Player player1, Player player2, Player player3) {
        team[0] = player1;
        team[1] = player2;
        team[2] = player3;
    }

    public void enterRoom(Location location) {
        if(location instanceof TreasureLocation) {
            ArrayList<Treasure> treasures = ((TreasureLocation) location).getTreasures();
//            System.out.println("-treasure!");
            teamCollect(treasures);
        } else {
            ArrayList<Enemy> enemies = ((EnemyLocation) location).getEnemies();
            teamFight(enemies);
        }
    }

    public void teamCollect(ArrayList<Treasure> treasures) {
        for(Player player : team) {
            for (Treasure treasure : treasures) {
                player.collect(treasure);
            }
        }
    }

    public void teamFight(ArrayList<Enemy> enemies) {
        System.out.println("-enemies here!");
    }
}
