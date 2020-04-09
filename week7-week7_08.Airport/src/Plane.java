public class Plane {
    private String name;
    private int capacity;

    public Plane(String planeName, int planeCapacity) {
        this.name = planeName;
        this.capacity = planeCapacity;
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String toString() {
        return this.name + " (" + this.capacity + ")";
    }
}
