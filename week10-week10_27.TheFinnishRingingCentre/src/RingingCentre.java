import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {
    //variables

    Map<Bird, List<String>> observationsPlaces;

    //constructor

    public RingingCentre() {
        this.observationsPlaces = new HashMap<Bird, List<String>>();
    }

    //methods

    public void observe(Bird bird, String place) {
        // which records the observation
        // and its place among the bird information
    }

    public void observations(Bird bird) {
        // which prints all the observations of the parameter bird
    }
}
