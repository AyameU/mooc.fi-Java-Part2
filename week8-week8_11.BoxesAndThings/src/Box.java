import java.util.ArrayList;

public class Box {
    private double maxWeight;
    private ArrayList<ToBeStored> thingsToBeStored = new ArrayList<ToBeStored>();
    private double currentWeight;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
    }

    public void add(ToBeStored t) {
        if(t.weight() + this.currentWeight <= this.maxWeight) {
            thingsToBeStored.add(t);
            this.currentWeight += t.weight();
        }
    }

    public int numOfThings() {
        return thingsToBeStored.size();
    }

    public String toString() {
        return "Box: " + numOfThings() + " things, total weight " + this.currentWeight + " kg";
    }
}
