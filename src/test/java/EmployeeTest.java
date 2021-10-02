import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.Rank;
import staff.cabinCrewMember.CabinCrewMember;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Employee employee;

    @Before
    public void before(){
        employee = new CabinCrewMember("Dave", Rank.FLIGHTATTENDANT);
    }

    @Test
    public void employeeHasName(){
        assertEquals("Dave", employee.getName());
    }

    @Test
    public void employeeHasRank(){
        assertEquals(Rank.FLIGHTATTENDANT, employee.getRank());
    }
}

