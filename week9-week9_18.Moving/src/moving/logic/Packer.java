package moving.logic;

import moving.domain.Box;
import moving.domain.Item;
import moving.domain.Thing;
import java.util.ArrayList;
import java.util.List;

public class Packer {
    private int boxesVolume;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
    }

    public List<Box> packThings(List<Thing> things) {
        List<Box> allThings = new ArrayList<Box>();
        for(Thing t : things) {
            Box newBox = new Box(this.boxesVolume);
            newBox.addThing(t);
            allThings.add(newBox);
        }
        return allThings;
    }
}
