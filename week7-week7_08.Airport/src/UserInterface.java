import java.util.Scanner;

public class UserInterface {
    private Scanner reader;
    private Airport airport;

    public UserInterface(Scanner scanner, Airport airport) {
        reader = scanner;
        this.airport = airport;
    }

    public void start() {
        System.out.println("Airport panel");
        System.out.println("--------------------");

        while(true) {
            commands();
            System.out.print("> ");
            String command = reader.nextLine();

            if(command.equals("1")) {
                System.out.print("Give plane ID: ");
                String planeName = reader.nextLine();

                System.out.print("Give plane capacity: ");
                int planeCapacity = Integer.parseInt(reader.nextLine());

                this.airport.addPlane(new Plane(planeName, planeCapacity));
            }
            else if(command.equals("2")) {
                String planeName;

                while(true) {
                    System.out.print("Give plane ID: ");
                    planeName = reader.nextLine();

                    if(this.airport.hasPlane(planeName)) {
                        planeName = airport.getPlane(planeName);
                        break;
                    }
                }

                System.out.print("Give departure airport code: ");
                int departureCode = Integer.parseInt(reader.nextLine());

                System.out.print("Give destination airport code: ");
                int destinationCode = Integer.parseInt(reader.nextLine());

                this.airport.addFlight(new Flight(planeName, departureCode, destinationCode));
            }
            else {
                break;
            }
        }
    }

    public void commands() {
        System.out.println("Choose operation:");
        System.out.println("[1] Add airplane");
        System.out.println("[2] Add flight");
        System.out.println("[x] Exit");
    }
}

/*
    airport.addPlane(new Plane("HA-LOL", 42));
    airport.addPlane(new Plane("AH-OMG", 175));
    airport.printPlanes();
    */
