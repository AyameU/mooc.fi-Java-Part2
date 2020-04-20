public class Flight {
    private String departureCode;
    private String destinationCode;

    public Flight(Plane plane, String departureCode, String destinationCode) {
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;
        this.plane = plane;
    }

    public String toString() {
        return this.plane + " (" + departureCode + "-" + destinationCode + ")";
    }
}
