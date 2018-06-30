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
import Player.Healers.Potion;
import Player.Team;
import Player.Magicians.Wizard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

// http://www.fantasynamegenerators.com

public class Runner {


    public static void main(String[] args) {

        // setup game
        ArrayList<Location> quest = new ArrayList<Location>();
        Team team = new Team();


        // setup potions
        Potion potion = new Potion("red potion", 10);
        Potion largepotion = new Potion("large potion", 20);

        // setup weapons
        Weapon axe = new Weapon( "axe", 15);
        Weapon club = new Weapon("club", 5);
        Weapon dagger = new Weapon("dagger", 4);
        Weapon saber = new Weapon( "saber", 12);
        Weapon sword = new Weapon( "sword", 9);

        // setup enemies
        Orc orc = new Orc("white orc", 40, dagger);
        Goblin goblin = new Goblin("Grut", 30, club);


        // populate location 1 (treasure)
        ArrayList<Treasure> treasures1 = new ArrayList<Treasure>();
        treasures1.add(potion);

        // populate location 2 (fight)
        ArrayList<Enemy> enemies1 = new ArrayList<Enemy>();
        enemies1.add(orc);
        enemies1.add(orc);


        // populate location 3 (fight)
        ArrayList<Enemy> enemies2 = new ArrayList<Enemy>();
        enemies2.add(goblin);
        enemies2.add(goblin);
        enemies2.add(goblin);


        // populate location 4 (treasure)
        ArrayList<Treasure> treasures2 = new ArrayList<Treasure>();
        treasures2.add(potion);
        treasures2.add(largepotion);


        // populate quest
        Location location1 = new TreasureLocation("chapter 1: ", "The old and rusty Wise Clock tower has always been infamous of its mystical creatures, deadly dungeons and tricky traps. You have no time to lose so you and your team enter the tower. Seems like it has not had visitors in a long time.. Luck seems to be on your side today. ", treasures1);
        Location location2 = new EnemyLocation("chapter 2", "That can be useful later...But now, you've no time to lose so you decide to take the old winch. But as you get closer you notice that the winch is guarded by two white orcs... Too late they already saw you, you gotta have to fight them! ", enemies1);
        Location location3 = new EnemyLocation("chapter 3", "ch 3", enemies2);
        Location location4 = new TreasureLocation("chapter 4", "ch 4", treasures2);
//        Location location5 = new TreasureLocation(treasures3);

//
        quest.add(location1);
        quest.add(location2);
        quest.add(location3);
        quest.add(location4);
//        quest.add(location5);


        System.out.println("Hi, press Enter to begin the CodeClan Quest! ");
        // enters if user presses enter //
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(s.length() == 0){

            // setup players and team
            System.out.println("Choose your players.");
            System.out.println("Who will be your fighter? ");
            Scanner reader1 = new Scanner(System.in);
            String player1 = reader1.nextLine();
            Barbarian barbarian = new Barbarian(player1,100, sword, 50);

            System.out.println("Who will be your magician? ");
            Scanner reader2 = new Scanner(System.in);
            String player2 = reader2.nextLine();
            Wizard wizard = new Wizard(player2, 100, 50, 50, null);

            System.out.println("Who will be your cleric? ");
            Scanner reader3 = new Scanner(System.in);
            String player3 = reader3.nextLine();
            Cleric cleric = new Cleric(player3, 100);



            team.addPlayers(barbarian, wizard, cleric);
            Game game = new Game(quest, team);

            Boolean inPlay = true;
            while (inPlay) {
                for (Location location : quest) {
                    game.playTurn(team, location);
                    inPlay = false;
                }

            }
        }





    }
}
