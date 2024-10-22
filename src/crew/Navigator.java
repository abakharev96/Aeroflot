package crew;

import airport.Airport;

public class Navigator {
    private String name;
    private int tiredness = 0;

    public Navigator(String name) {
        this.name = name;
    }

    public int getTiredness() {
        return tiredness;
    }

    public String getName() {
        return name;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public String navigating(String action) {
        return action;
    }

    public Airport setDestination(String destination) {
        System.out.println("Destination: " + destination);
        return new Airport(destination);
    }
}
