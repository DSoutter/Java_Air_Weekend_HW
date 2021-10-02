import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.Rank;
import staff.cabinCrewMember.CabinCrewMember;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabinCrewMember;

    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Dave", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Dave", cabinCrewMember.getName());
    }

    @Test
    public void employeeHasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, cabinCrewMember.getRank());
    }

    @Test
    public void employeeCanSpeak(){
        assertEquals("Welcome to the flight", cabinCrewMember.speakToPassengers());
    }
}
