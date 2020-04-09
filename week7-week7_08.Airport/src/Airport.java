import java.util.HashMap;
import java.util.ArrayList;

public class Airport {
    private HashMap<String, Plane> planes = new HashMap<String, Plane>();
    private ArrayList<Flight> flights = new ArrayList<Flight>();

    public void addPlane(Plane plane) {
        if(planes.containsKey(plane.getName())) {
            System.out.println("No plane exists with that name.");
        }
        else {
            planes.put(plane.getName(), plane);
        }
    }

    public void printPlanes() {
        System.out.println(new ArrayList<Plane>(this.planes.values()));
    }

    public boolean hasPlane(String planeName) {
        if(planes.containsValue(planeName)) {
            return true;
        }
        return false;
    }

    public String getPlane(String planeName) {
        String getPlaneName;
        if(planes.containsKey(planeName)) {
            getPlaneName = planes.get(planeName);
        }
        else {
            getPlaneName = null;
        }
        return getPlaneName;
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

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
