import org.junit.Before;
import org.junit.Test;
import staff.Rank;
import staff.cabinCrewMember.CabinCrewMember;
import staff.pilot.Pilot;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private ArrayList<Pilot> pilotArrayList;
    private Pilot pilot1;
    private Pilot pilot2;
    private ArrayList<Passenger> passengerArrayList;
    private Passenger passenger1;
    private Passenger passenger2;
    private ArrayList<CabinCrewMember> cabinCrewMemberArrayList;
    private CabinCrewMember cabinCrewMember1;
    private CabinCrewMember cabinCrewMember2;
    private FlightManager flightManager;

    @Before
    public void before(){
        pilotArrayList = new ArrayList<>();
        cabinCrewMemberArrayList = new ArrayList<>();
        pilot1 = new Pilot("Jim", Rank.CAPTAIN, "license123");
        pilot2 = new Pilot("Bob", Rank.FIRSTOFFICER, "license1234");
        pilotArrayList.add(pilot1);
        pilotArrayList.add(pilot2);
        passenger1 = new Passenger("Gemma", 2);
        passenger2 = new Passenger("Rhys", 4);
        cabinCrewMember1 = new CabinCrewMember("Jane", Rank.PURSER);
        cabinCrewMember2 = new CabinCrewMember("John", Rank.FLIGHTATTENDANT);
        cabinCrewMemberArrayList.add(cabinCrewMember1);
        cabinCrewMemberArrayList.add(cabinCrewMember2);
        flight = new Flight(pilotArrayList, cabinCrewMemberArrayList, PlaneType.SESSNA, "BA256", "CDG", "GLA", "13:00");
        flightManager = new FlightManager("Jerry", flight);
    }

    @Test
    public void flightHas2Pilots(){
        assertEquals(2, flight.getPilots().size());
    }

    @Test
    public void flightHas2Crew(){
        assertEquals(2, flight.getCabinCrew().size());
    }

    @Test
    public void flightHasNoPassengers(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void flightCanAddPassengers(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(PlaneType.SESSNA, flight.getPlaneType());
    }

    @Test
    public void flightHasNumber(){
        assertEquals("BA256", flight.getFlightNo());
    }

    @Test
    public void flightHasDest(){
        assertEquals("CDG", flight.getDestination());
    }

    @Test
    public void flightHasDept(){
        assertEquals("GLA", flight.getDeparture());
    }

    @Test
    public void flightHasDeptTime(){
        assertEquals("13:00", flight.getDepartureTime());
    }

    @Test
    public void planeHasAllRemainingSeats(){
        assertEquals(2, flight.availableSeats());
    }

    @Test
    public void planeHas1seatLeft(){
        flight.addPassenger(passenger1);
        assertEquals(1, flight.availableSeats());
    }

    @Test
    public void planeWontTakeMoreThan2(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        flight.addPassenger(passenger1);
        assertEquals(2, flight.getPassengers().size());
    }

    @Test
    public void flightManagerKnowsBaggage(){
        assertEquals(3, flightManager.baggagePerPerson(flight));
    }

    @Test
    public void flightManagerKnowsWeightofBaggage(){
        flight.addPassenger(passenger1);
        assertEquals(40, flightManager.weightOfBaggage(flight));
    }

    @Test
    public void flightManagerKnowsWeight2(){
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger1);
        assertEquals(80, flightManager.weightOfBaggage(flight));
    }

    @Test
    public void flightManagerKnowsWhatsLeft(){
        flight.addPassenger(passenger1);
        assertEquals(110, flightManager.remainingAllowance(flight));
    }
}
