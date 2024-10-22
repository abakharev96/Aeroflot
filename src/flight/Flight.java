package flight;

import crew.FlightAttendant;
import crew.Navigator;
import crew.Pilot;
import crew.RadioOperator;
import plane.Plane;

public class Flight {
    private Plane plane;
    private FlightAttendant flightAttendant;
    private Navigator navigator;
    private Pilot pilot1;
    private Pilot pilot2;
    private RadioOperator radioOperator;

    public Flight(Plane plane, FlightAttendant flightAttendant, Navigator navigator, Pilot pilot1, Pilot pilot2, RadioOperator radioOperator) {
        this.plane = plane;
        this.flightAttendant = flightAttendant;
        this.navigator = navigator;
        this.pilot1 = pilot1;
        this.pilot2 = pilot2;
        this.radioOperator = radioOperator;
    }

    public void makeFlight() throws InterruptedException {
        System.out.println(radioOperator.operating(radioOperator.getName() + ", radio operator: Im operating"));
        radioOperator.setTiredness(radioOperator.getTiredness() + 15);
        Thread.sleep(1500);

        System.out.println(flightAttendant.getName() + ", flight attendant: " + flightAttendant.serveDrinks());
        flightAttendant.setTiredness(flightAttendant.getTiredness() + 5);
        Thread.sleep(1500);

        System.out.println(pilot1.piloting(pilot1.getName() + ", pilot1: Im piloting."));
        pilot1.setTiredness(pilot1.getTiredness() + 20);
        Thread.sleep(1500);

        System.out.println(navigator.navigating(navigator.getName() + ", navigator: Im navigator."));
        navigator.setTiredness(navigator.getTiredness() + 15);
        Thread.sleep(1500);

        System.out.println(flightAttendant.getName() + ", flight attendant: " + flightAttendant.serveFood());
        flightAttendant.setTiredness(flightAttendant.getTiredness() + 10);
        Thread.sleep(1500);

        System.out.println(pilot2.piloting(pilot2.getName() + ", pilot2: Im helping pilot1."));
        pilot2.setTiredness(pilot2.getTiredness() + 20);
        Thread.sleep(1500);


    }
}
