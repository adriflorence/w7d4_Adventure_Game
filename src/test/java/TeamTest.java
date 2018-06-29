import Player.Fighters.Knight;
import Player.Fighters.Weapon;
import Player.Healers.Cleric;
import Player.Magicians.Creature;
import Player.Magicians.Wizard;
import Player.Team;
import org.junit.Before;

public class TeamTest {

    Team team;
    Knight player1;
    Wizard player2;
    Cleric player3;
    Weapon axe;
    Creature stag, dragon;

    @Before
    public void setUp() throws Exception {
        team = new Team();

        stag = new Creature("Stag", 50, 12);
        dragon = new Creature("Green Dragon", 100, 18);

        axe = new Weapon( "sword", 12);

        player1 = new Knight("Billy", 100, axe, 40);
        player2 = new Wizard("Harry", 100, 20, 100, stag);
        player3 = new Cleric("Father John Misty", 100);
        team.addPlayers(player1, player2, player3);
    }


}
