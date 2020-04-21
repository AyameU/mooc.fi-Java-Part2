public class Flight {
    private Plane plane;
    private String planeId;
    private String departureCode;
    private String destinationCode;

    public Flight(Plane plane, String departureCode, String destinationCode) {
        this.plane = plane;
        this.planeId = plane.getId();
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    public String toString() {
        return this.plane + " (" + departureCode + "-" + destinationCode + ")";
    }
}
