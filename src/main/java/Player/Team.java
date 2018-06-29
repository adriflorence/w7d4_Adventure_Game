package Player;

import Locations.Location;

public class Team {

    Player[] team;
    Gold gold;

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
    }
}
