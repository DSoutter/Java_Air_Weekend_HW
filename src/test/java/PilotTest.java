import org.junit.Before;
import org.junit.Test;
import staff.Rank;
import staff.pilot.Pilot;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Kareem Abdul-Jabbar", Rank.FIRSTOFFICER, "abcd1234");
    }

    @Test
    public void pilotHasName(){
        assertEquals("Kareem Abdul-Jabbar", pilot.getName());
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.FIRSTOFFICER, pilot.getRank());
    }

    @Test
    public void pilotHasLicenseNum(){
        assertEquals("abcd1234", pilot.getLicenseNum());
    }

    @Test
    public void pilotSaysFly(){
        assertEquals("Liftoff!", pilot.flyPlane());
    }
}
