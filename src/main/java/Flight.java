import staff.cabinCrewMember.CabinCrewMember;
import staff.pilot.Pilot;

import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNo;
    private String destination;
    private String departure;
    private String departureTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrew, PlaneType planeType, String flightNo, String destination, String departure, String departureTime) {
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.passengers = new ArrayList<>();
        this.planeType = planeType;
        this.flightNo = flightNo;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getDestination() {
        return destination;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPassenger(Passenger passenger){
        passengers.add(passenger);
    }
}
