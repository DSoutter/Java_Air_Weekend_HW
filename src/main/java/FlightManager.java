import staff.Employee;
import staff.Rank;

public class FlightManager {

    private String name;
    private Flight flight;

    public FlightManager(String name, Flight flight) {
        this.name = name;
        this.flight = flight;
    }

    public String getName() {
        return name;
    }

    public Flight getFlight() {
        return flight;
    }

    public int baggagePerPerson(Flight flight){
            double weightForLuggage = flight.getPlaneType().getTotalWeight()/2;
            int capacity = flight.getPlaneType().getCapcity();
            int numberOfLuggage = (int) ((weightForLuggage/capacity)/20);
            return numberOfLuggage;
        }

    public int weightOfBaggage(Flight flight){
        int totalBaggage = 0;
        for (int i = 0; i < flight.getPassengers().size(); i++){
            totalBaggage+=flight.getPassengers().get(i).getNumberOfBags();
        }
        return totalBaggage * 20;
    }
}

