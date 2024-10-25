package flight;

import airport.Airport;
import crew.FlightAttendant;
import crew.Navigator;
import crew.Pilot;
import crew.RadioOperator;
import plane.Plane;

import java.util.Random;

public class Flight {
    private Plane plane;
    private FlightAttendant flightAttendant;
    private Navigator navigator;
    private Pilot pilot1;
    private Pilot pilot2;
    private RadioOperator radioOperator;
    private String flightName;
    private String destination;

    public Flight(Plane plane, FlightAttendant flightAttendant, Navigator navigator, Pilot pilot1, Pilot pilot2, RadioOperator radioOperator, String flightName,
                  String destination) {
        this.plane = plane;
        this.flightAttendant = flightAttendant;
        this.navigator = navigator;
        this.pilot1 = pilot1;
        this.pilot2 = pilot2;
        this.radioOperator = radioOperator;
        this.flightName = flightName;
        this.destination = destination;
    }

    public void makeFlight() throws InterruptedException {
        System.out.println("Flight " + flightName + " is started.");
        Thread.sleep(1500);

        System.out.println(flightAttendant.getName() + ", flight attendant: " + flightAttendant.serveDrinks());
        flightAttendant.setTiredness(flightAttendant.getTiredness() + 5);
        Thread.sleep(1500);

        System.out.println(pilot1.piloting(pilot1.getName() + ", pilot1: Im piloting."));
        pilot1.setTiredness(pilot1.getTiredness() + 20);
        Thread.sleep(1500);

        System.out.println("Navigator " + navigator.getName() + "navigating to " + destination);
        Airport airport = navigator.setDestination(destination);
        Thread.sleep(1500);

        System.out.println(flightAttendant.getName() + ", flight attendant: " + flightAttendant.serveFood());
        flightAttendant.setTiredness(flightAttendant.getTiredness() + 10);
        Thread.sleep(1500);

        System.out.println(pilot2.piloting(pilot2.getName() + ", pilot2: Im helping pilot1."));
        pilot2.setTiredness(pilot2.getTiredness() + 20);
        Thread.sleep(1500);

        //System.out.println(radioOperator.operating(radioOperator.getName() + ", radio operator: Im operating"));
        String weather = radioOperator.checkWeatherInDestination(airport);
        if (weather.equals("storm")) {
            System.out.println("The landing place was changed due to the bad weather.");
            Random random = new Random();
            int randomNum = random.nextInt(4);
            String[] varsDestination = {"Moscow", "Warsaw", "Kazan", "Minsk"};
            String newDestination = varsDestination[randomNum];
            System.out.println("Destination was changed to " + newDestination);
            airport.setDestination(newDestination);
        }
        radioOperator.setTiredness(radioOperator.getTiredness() + 15);
        Thread.sleep(1500);

        plane.setFuel(plane.getFuel() - 40);

        System.out.println(airport.receivePlane(flightName));

    }
}
