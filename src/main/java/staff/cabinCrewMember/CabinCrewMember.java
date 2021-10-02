package staff.cabinCrewMember;

import staff.Employee;
import staff.Rank;

public class CabinCrewMember extends Employee {

    public CabinCrewMember(String name, Rank rank) {
        super(name, rank);
    }

    public String speakToPassengers(){
        return "Welcome to the flight";
    }
}
