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
    Creature[] creature;
    Creature stag;

    @Before
    public void setUp() throws Exception {
        team = new Team();
        player1 = new Knight("Billy", 100, Weapon.SPEAR, 40);
        creature[0] = stag; // list of creatures
        player2 = new Wizard("Harry", 100, 20, creature);
        team.addPlayers(player1, player2, player3);
    }
}
