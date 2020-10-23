package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {

    private int maxWeight;
    private ArrayList<Thing> things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<Thing>();
    }

    public int getWeight() {
        int currentWeight = 0;
        for(Thing t : things) {
            currentWeight += t.getWeight();
        }
        return currentWeight;
    }

    @Override
    public void add(Thing thing) {
        if((maxWeight - this.getWeight()) >= thing.getWeight()) {
            things.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(things.contains(thing)) {
            return true;
        }
        return false;
    }
}
