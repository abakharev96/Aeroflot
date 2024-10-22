import crew.FlightAttendant;
import crew.Navigator;
import crew.Pilot;
import crew.RadioOperator;
import flight.Flight;
import plane.Plane;

import java.util.Random;
import java.util.Scanner;

public class Administration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! This is a short version of Aeroflot in Java! \n" +
                "You can send a person to one of the city in list: \n" +
                "1. Moscow; \n" +
                "2. Warsaw; \n" +
                "3. Kazan; \n" +
                "4. Minsk. \n" +
                "To proceed, please enter the number of the city. To exit please enter 9.");

        FlightAttendant flightAttendant = new FlightAttendant(generateCrewName());
        Navigator navigator = new Navigator(generateCrewName());
        Pilot pilot1 = new Pilot(generateCrewName());
        Pilot pilot2 = new Pilot(generateCrewName());
        RadioOperator radioOperator = new RadioOperator(generateCrewName());

        while (scanner.hasNextInt()) {
            int city = scanner.nextInt();
            String flightName = createNewFlightName();
            if (city == 1) {
                prepareFlightMoscow(flightName, flightAttendant, navigator, pilot1, pilot2, radioOperator);
            } else if (city == 2) {
                prepareFlightWarsaw(flightName, flightAttendant, navigator, pilot1, pilot2, radioOperator);
            } else if (city == 3) {
                prepareFlightKazan(flightName, flightAttendant, navigator, pilot1, pilot2, radioOperator);
            } else if (city == 4) {
                prepareFlightMinsk(flightName, flightAttendant, navigator, pilot1, pilot2, radioOperator);
            }
        }
    }

    public static void prepareFlightMoscow(String flightName, FlightAttendant flightAttendant, Navigator navigator, Pilot pilot1, Pilot pilot2, RadioOperator radioOperator) {
        Plane plane = new Plane("b747", flightName);
        plane.setFuel(60);

        Flight flight = new Flight(plane, flightAttendant, navigator, pilot1, pilot2, radioOperator);

        if (checkCrew(flightAttendant, navigator, pilot1, pilot2, radioOperator)) {
            try {
                flight.makeFlight();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("oh no, the crew is too tired, see you next time");
            System.exit(0);
        }
    }

    public static void prepareFlightWarsaw(String flightName, FlightAttendant flightAttendant, Navigator navigator, Pilot pilot1, Pilot pilot2, RadioOperator radioOperator) {
        Plane plane = new Plane("b747", flightName);
        plane.setFuel(100);

        Flight flight = new Flight(plane, flightAttendant, navigator, pilot1, pilot2, radioOperator);

        if (checkCrew(flightAttendant, navigator, pilot1, pilot2, radioOperator)) {
            try {
                flight.makeFlight();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("oh no, the crew is too tired, see you next time");
            System.exit(0);
        }
    }

    public static void prepareFlightKazan(String flightName, FlightAttendant flightAttendant, Navigator navigator, Pilot pilot1, Pilot pilot2, RadioOperator radioOperator) {
        Plane plane = new Plane("b747", flightName);
        plane.setFuel(45);

        Flight flight = new Flight(plane, flightAttendant, navigator, pilot1, pilot2, radioOperator);

        if (checkCrew(flightAttendant, navigator, pilot1, pilot2, radioOperator)) {
            try {
                flight.makeFlight();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("oh no, the crew is too tired, see you next time");
            System.exit(0);
        }
    }

    public static void prepareFlightMinsk(String flightName, FlightAttendant flightAttendant, Navigator navigator, Pilot pilot1, Pilot pilot2, RadioOperator radioOperator) {
        Plane plane = new Plane("b747", flightName);
        plane.setFuel(80);

        Flight flight = new Flight(plane, flightAttendant, navigator, pilot1, pilot2, radioOperator);

        if (checkCrew(flightAttendant, navigator, pilot1, pilot2, radioOperator)) {
            try {
                flight.makeFlight();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("oh no, the crew is too tired, see you next time");
            System.exit(0);
        }
    }

    public static String createNewFlightName() {
        String flightName = "FV ";
        Random rand = new Random();
        for (int i = 0; i < 4; i++) {
            flightName += String.valueOf(rand.nextInt(10));
        }
        return flightName;
    }

    public static String generateCrewName() {
        String fullName = "";
        String[] firstName = {"Alice", "John", "Bob", "Mark", "Steve", "Angelina", "Ilon", "Max", "Alex"};
        String[] secondName = {"Brown", "Jolie", "Jackson", "Lucky", "Black", "Jones", "Lindemann", "Fisher"};

        Random rand = new Random();
        int firstNameIndex = rand.nextInt(firstName.length);
        int secondNameIndex = rand.nextInt(secondName.length);
        return firstName[firstNameIndex] + " " + secondName[secondNameIndex];
    }

    public static boolean checkCrew(FlightAttendant flightAttendant, Navigator navigator, Pilot pilot1, Pilot pilot2, RadioOperator radioOperator) {
        return flightAttendant.getTiredness() < 100 && navigator.getTiredness() < 100 && pilot1.getTiredness() < 100 && pilot2.getTiredness() < 100 && radioOperator.getTiredness() < 100;
    }
}