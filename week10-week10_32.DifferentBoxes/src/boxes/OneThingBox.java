package boxes;

import java.util.ArrayList;

public class OneThingBox extends Box {

    private ArrayList<Thing> item;

    public OneThingBox() {
        item = new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(item.size() == 0) {
            item.add(thing);
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(!item.isEmpty() && item.get(0).equals(thing)) {
            return true;
        }
        return false;
    }
}
