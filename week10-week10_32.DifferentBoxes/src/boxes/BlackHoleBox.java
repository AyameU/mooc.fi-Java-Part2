package boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box {

    private ArrayList<Thing> things;

    public BlackHoleBox() {
        things = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        things.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
