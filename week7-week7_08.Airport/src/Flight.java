public class Flight {
    private String planeName;
    private String departureCode;
    private String destinationCode;

    public Flight(String planeName, String departureCode, String destinationCode) {
        this.departureCode = departureCode;
        this.destinationCode = destinationCode;

        if(airport.hasPlane(planeName)) {
            this.planeName = planeName;
        }
    }

    public String toString() {
        return this.planeName + " (" + this.plane.getCapacity() + ") (" + this.departureCode + "-" + this.departureCode + ")";
    }
}
