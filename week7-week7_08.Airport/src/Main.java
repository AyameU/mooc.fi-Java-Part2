import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Airport airport = new Airport();

        UserInterface ui = new UserInterface(scanner, airport);
        ui.start();
    }

    /*
    airport.addPlane(new Plane("HA-LOL", 42));
    airport.addPlane(new Plane("AH-OMG", 175));
    airport.printPlanes();
    */
}
