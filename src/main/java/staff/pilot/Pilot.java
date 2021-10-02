package staff.pilot;

import staff.Employee;
import staff.Rank;

public class Pilot extends Employee {

    private String licenseNum;

    public Pilot(String name, Rank rank, String licenseNum) {
        super(name, rank);
        this.licenseNum = licenseNum;
    }

    public String getLicenseNum() {
        return this.licenseNum;
    }

    public String flyPlane(){
        return "Liftoff!";
    }
}
