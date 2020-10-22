package farmsimulator;

public class MilkingRobot{

    private BulkTank tank;

    // creates a new milking robot
    public MilkingRobot() {
    }

    // returns the connected bulk tank, or a null reference,
    // if the tank hasn't been installed
    public BulkTank getBulkTank() {

        if(tank == null) {
            return null;
        }
        else {
            return tank;
        }
    }

    // installs the parameter bulk tank to the milking robot
    public void setBulkTank(BulkTank tank) {
        this.tank = tank;
    }

    // milks the cow and fills the connected bulk tank;
    // the method returns an IllegalStateException is no tank has been fixed
    public void milk(Milkable milkable) {

        if(this.getBulkTank() == null) {
            throw new IllegalStateException("No tank has been fixed.");
        }
        else {
            double milk = milkable.milk();
            tank.addToTank(milk);
        }
    }
}
