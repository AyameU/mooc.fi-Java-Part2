package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank tank;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.tank = tank;
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        robot = milkingRobot;
        robot.setBulkTank(tank);
    }

    public void takeCareOf(Cow cow) {
        if(robot == null) {
            throw new IllegalStateException("The milking robot has not been installed.");
        }
        else {
            robot.milk(cow);
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        if(robot == null) {
            throw new IllegalStateException("The milking robot has not been installed.");
        }
        else {
            for(Cow c : cows) {
                robot.milk(c);
            }
        }
    }

    public String toString() {
        return tank.toString();
    }
}
