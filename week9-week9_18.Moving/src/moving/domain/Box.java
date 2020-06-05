package moving.domain;

import java.util.List;
import java.util.ArrayList;

public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> things;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }

    public boolean addThing(Thing thing) {
        if((thing.getVolume() + this.getVolume()) <= this.maximumCapacity) {
            this.things.add(thing);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int getVolume() {
        int currentVolume = 0;

        for(Thing t : this.things) {
            currentVolume += t.getVolume();
        }
        return currentVolume;
    }
}
