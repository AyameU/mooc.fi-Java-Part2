import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> thingsToBeStored = new ArrayList<ToBeStored>();

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void add(ToBeStored t) {
        if(t.weight() + weight() <= this.maxWeight) {
            thingsToBeStored.add(t);
        }
    }

    public int numOfThings() {
        return thingsToBeStored.size();
    }

    @Override
    public double weight() {
        double weight = 0;

        for(ToBeStored t : thingsToBeStored) {
            weight += t.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: " + numOfThings() + " things, total weight " + weight() + " kg";
    }
}