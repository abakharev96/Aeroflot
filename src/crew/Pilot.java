package crew;

public class Pilot {
    private String name;
    private int tiredness;

    public Pilot(String name) {
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

    public String piloting(String action){
        return action;
    }


}
