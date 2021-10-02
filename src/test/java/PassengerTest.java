import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Lesley", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Lesley", passenger.getName());
    }
}
