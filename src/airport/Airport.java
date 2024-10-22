package airport;

import java.util.Random;

public class Airport {
    String destination;

    public Airport(String destination) {
        this.destination = destination;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String sendWeather() {
        Random rand = new Random();
        int randomNum = rand.nextInt(4);
        String[] weather = {"amazing", "windy", "cloudy", "storm"};
        return weather[randomNum];
    }

    public String receivePlane(String flightName) {
        return "Plane " + flightName + " was successfully landed.";
    }
}
