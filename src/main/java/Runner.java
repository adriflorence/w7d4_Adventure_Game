import Enemy.Orc;
import Enemy.Enemy;
import Enemy.Goblin;
import Locations.EnemyLocation;
import Locations.Location;
import Locations.Treasure;
import Locations.TreasureLocation;

import Player.Fighters.Barbarian;
import Player.Fighters.Weapon;
import Player.Healers.Cleric;
import Player.Game;
import Player.Team;
import Player.Magicians.Wizard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

// http://www.fantasynamegenerators.com

public class Runner {


    public static void main(String[] args) {

        ArrayList<Location> quest = new ArrayList<Location>();
        ArrayList<Treasure> treasures = new ArrayList<Treasure>();
        ArrayList<Enemy> enemies = new ArrayList<Enemy>();
        Team team = new Team();


        // populate treasure locations
        Weapon sword = new Weapon( "sword", 9);
        Weapon saber = new Weapon( "saber", 12);
        Weapon axe = new Weapon( "axe", 15);
        treasures.add(sword);
        treasures.add(saber);
        treasures.add(axe);


        // populate enemy locations
        Weapon dagger = new Weapon("dagger", 4);
        Weapon club = new Weapon("club", 5);
        Orc orc = new Orc("white orc", 40, dagger);
        Goblin goblin = new Goblin("Grut", 30, club);
        enemies.add(orc);
        enemies.add(goblin);
        EnemyLocation enemyLocation = new EnemyLocation(enemies);


        // populate quest
        Location location1 = new TreasureLocation(treasures);
        Location location2 = new EnemyLocation(enemies);
        quest.add(location1);
        quest.add(location2);


        // setup team
        Barbarian barbarian = new Barbarian("Derek",100, sword, 50);
        Wizard wizard = new Wizard("Pete", 100, 50, 50, null);
        Cleric cleric = new Cleric("Father John", 100);
        team.addPlayers(barbarian, wizard, cleric);

        Game game = new Game(quest, treasures, enemies, team);

        System.out.println("Hi, press Enter to begin!");
        // enters if user presses enter //
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(s.length() == 0){
            Boolean inPlay = true;

            while (inPlay) {
                for (Location location : quest) {
                    game.playTurn(team, location);
                }

            }
        }





    }
}
