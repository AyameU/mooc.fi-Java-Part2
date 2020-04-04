import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things = new ArrayList<Thing>();
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addThing(Thing thing) {
        if(totalWeight() + thing.getWeight() <= this.maxWeight) {
            things.add(thing);
        }
    }

    public void printThings() {
        for(Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;

        for(Thing thing : things) {
            currentWeight += thing.getWeight();
        }
        return currentWeight;
    }

    public Thing heaviestThing() {
        Thing heaviestThing = null;
        int heaviestWeight = 0;

        for(Thing thing : things) {
            if(thing.getWeight() >= heaviestWeight) {
                heaviestThing = thing;
                heaviestWeight = thing.getWeight();
            }
        }
        return heaviestThing;
    }

    public String toString() {
        if(things.size() == 0) {
            return "empty (" + totalWeight() + " kg)";
        }
        else if(things.size() == 1) {
            return things.size() + " thing (" + totalWeight() + " kg)";
        }
        return things.size() + " things (" + totalWeight() + " kg)";
    }
}
