package plane;

public class Plane {
    private String name;
    private String flightName;
    private int fuel;
    private double technicalFailureProbability;

    public Plane(String name, String flightName) {
        this.name = name;
        this.flightName = flightName;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
