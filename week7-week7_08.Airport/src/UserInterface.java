import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class UserInterface {
    private Scanner reader;
    private String command;
    private HashMap<String, Plane> airport = new HashMap<String, Plane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();

    public UserInterface(Scanner scanner) {
        reader = scanner;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");

        while(true) {
            airportPanelCommands();
            commandPrompt();

            if(command.equals("1")) {
                System.out.print("Give plane ID: ");
                String planeId = reader.nextLine();

                System.out.print("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(reader.nextLine());

                airport.put(planeId, new Plane(planeId, planeCapacity));
            }
            else if(command.equals("2")) {
                String planeId;

                while(true) {
                    System.out.print("Give plane ID: ");
                    planeId = reader.nextLine();

                    if(hasPlane(planeId)) {
                        planeId = airport.get(planeId).getId();
                        break;
                    }
                }

                System.out.print("Give departure airport code: ");
                String departureCode = reader.nextLine();

                System.out.print("Give destination airport code: ");
                String destinationCode = reader.nextLine();

                flights.add(new Flight(airport.get(planeId), departureCode, destinationCode));
            }

            // Initiate Flight service Panel

            else {
                System.out.println("Flight service panel");
                System.out.println("--------------------");

                while(true) {
                    flightServiceCommands();
                    commandPrompt();

                    if (command.equals("1")) {
                        printPlanes();
                    }
                    else if (command.equals("2")) {
                        printFlights();
                    }
                    else if (command.equals("3")) {
                        System.out.print("Give plane ID: ");
                        String planeId = reader.nextLine();

                        printPlaneInfo(planeId);
                    }
                    else {
                        break;
                    }
                }
                break;
            }
        }
    }

    // User Interface Methods

    public void airportPanelCommands() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }

    public void flightServiceCommands() {
        System.out.println("Choose operation:");
        System.out.println("[1] Print planes");
        System.out.println("[2] Print flights");
        System.out.println("[3] Print plane info");
        System.out.println("[x] Quit");
    }

    public void commandPrompt() {
        System.out.print("> ");
        command = reader.nextLine();
    }

    // Plane Methods

    public boolean hasPlane(String planeId) {
        if(airport.containsKey(planeId)) {
            return true;
        }
        return false;
    }

    public void printPlaneInfo(String planeId) {
        if(hasPlane(planeId)) {
            System.out.println(airport.get(planeId));
        }
    }

    public void printPlanes() {
        ArrayList<Plane> planes = new ArrayList<Plane>(this.airport.values());
        for(Plane plane : planes) {
            System.out.println(plane);
        }
    }

    // Flight Methods

    public void printFlights() {
        if(!flights.isEmpty()) {
            for(Flight flight : flights) {
                System.out.println(flight);
            }
        }
        else {
            System.out.println("There are no planes to list.");
        }
    }
}