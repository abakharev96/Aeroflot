package crew;

import airport.Airport;

public class RadioOperator {
    private String name;
    private int tiredness = 0;

    public RadioOperator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }

    public String operating(String action){
        return action;
    }

    public String checkWeatherInDestination(Airport airport){
        return airport.sendWeather();
    }
}
