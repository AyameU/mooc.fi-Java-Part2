public class Flight {
    private String planeId;
    private String departureCode;
    private String destinationCode;

    public Flight(Plane plane, String departureCode, String destinationCode) {
        this.planeId = plane.getId();
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
    }

    public String toString() {
        return this.planeId + " (" + departureCode + "-" + destinationCode + ")";
    }
}
