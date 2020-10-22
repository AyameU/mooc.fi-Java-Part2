package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    /*
     * Default Constructor
     */
    public BulkTank() {

        capacity = 2000.00;
        volume = 0.0;
    }

    /*
     * Overloaded Constructor
     */
    public BulkTank(double capacity) {

        this.capacity = capacity;
        volume = 0.0;
    }

    public double getCapacity() {

        return capacity;
    }

    public double getVolume() {

        return volume;
    }

    public double howMuchFreeSpace() {

        if(volume == 0.0) {
            return capacity;
        }
        else if(volume == capacity) {
            return 0.0;
        }
        else {
            return capacity - volume;
        }
    }

    /*
     * adds to the tank only as much milk as it fits;
     * the additional milk will not be added, and you
     * don't have to worry about a situation where the
     * milk spills over
     */
    public void addToTank(double amount) {

        if(this.howMuchFreeSpace() >= amount) {
            volume += amount;
        }
        else if(this.howMuchFreeSpace() < amount) {
            volume += this.howMuchFreeSpace();
        }
    }

    /*
     * takes the required amount from the tank,
     * or as much as there is left
     */
    public double getFromTank(double amount) {

        if(volume == 0.0) {
            return volume;
        }
        else if(volume < amount) {
            volume = 0.0;
            return volume;
        }
        else {
            return volume -= amount;
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.getVolume()) + "/" + Math.ceil(this.getCapacity());
    }
}
