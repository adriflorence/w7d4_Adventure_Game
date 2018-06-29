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
    Creature stag, dragon;

    @Before
    public void setUp() throws Exception {
        team = new Team();

        stag = new Creature("Stag", 50, 12);
        dragon = new Creature("Green Dragon", 100, 18);

        player1 = new Knight("Billy", 100, Weapon.SPEAR, 40);
        player2 = new Wizard("Harry", 100, 20, stag);
        player3 = new Cleric("Father Joe", 100);
        team.addPlayers(player1, player2, player3);
    }
}
