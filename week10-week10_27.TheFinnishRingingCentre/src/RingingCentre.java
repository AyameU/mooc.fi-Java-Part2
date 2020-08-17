import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> observationsPlaces;

    public RingingCentre() {
        this.observationsPlaces = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String place) {
        if(!this.observationsPlaces.containsKey(bird)) {
            List<String> places = new ArrayList<String>();
            places.add(place);
            this.observationsPlaces.put(bird, places);
        }
        else if(this.observationsPlaces.containsKey(bird)) {
            this.observationsPlaces.get(bird).add(place);
        }

    }

    public void observations(Bird bird) {
        if(observationsPlaces.containsKey(bird)) {
            int numObservations = observationsPlaces.get(bird).size();
            System.out.println(bird + " observations: " + numObservations);

            // print all places observed
            for(String p : observationsPlaces.get(bird)) {
                System.out.println(p);
            }

        }
        else {
            System.out.println(bird + " observations: 0");
        }
    }
}
