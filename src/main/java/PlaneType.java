public enum PlaneType {

    BOWING747(100, 10000.0),
    SESSNA(2, 300.0),
    AIRBUSA380(300, 40000.0);

    private int capcity;
    private double totalWeight;

    PlaneType(int capcity, double totalWeight) {
        this.capcity = capcity;
        this.totalWeight = totalWeight;
    }

    public int getCapcity() {
        return this.capcity;
    }

    public double getTotalWeight() {
        return this.totalWeight;
    }
    
}
