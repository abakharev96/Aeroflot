package crew;

public class FlightAttendant {
    private String name;
    private int tiredness = 0;

    public FlightAttendant(String name) {
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

    public String serveDrinks(){
        return "Drinks Served";
    }

    public String serveFood(){
        return "Food Served";
    }
}
