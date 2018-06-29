package Player;
import Locations.Location;
import Locations.Treasure;

import java.util.ArrayList;

public class Game {

    ArrayList<Location> quest;
    ArrayList<Treasure> treasure;

    public Game(ArrayList<Location> quest, ArrayList<Treasure> treasure){
        this.quest = quest;
        this.treasure = treasure;
    }

//    public void playTurn(Team team) {
//        team.enterRoom();
//    }

}
