package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> objects;

    public Group() {
        this.objects = new ArrayList<Movable>();
    }

    public String toString() {
        String allObjects = "";
        for(Movable o : this.objects) {
            allObjects += o.toString();
            allObjects += "\n";
        }
        return allObjects;
    }

    public void addToGroup(Movable movable) {
        this.objects.add(movable);
    }

    public void move(int dx, int dy) {
        for(Movable o : this.objects) {
            o.move(dx,dy);
        }
    }
}
