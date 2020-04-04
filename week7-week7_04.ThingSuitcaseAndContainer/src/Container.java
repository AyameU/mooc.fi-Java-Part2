import java.util.ArrayList;

public class Container {
    private int maxWeight;
    private int currentWeight;
    private ArrayList<Suitcase> container = new ArrayList<Suitcase>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if(suitcase.totalWeight() + currentWeight <= this.maxWeight) {
            container.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }

    public void printThings() {
        for(Suitcase suitcase : container) {
            suitcase.printThings();
        }
    }

    public String toString() {
        return container.size() + " suitcases (" + currentWeight + " kg)";
    }
}
