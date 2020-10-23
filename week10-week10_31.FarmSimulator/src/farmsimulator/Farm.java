package farmsimulator;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Farm implements Alive {

    private String owner;
    private Barn barn;
    private ArrayList<Cow> herd;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        herd = new ArrayList<Cow>();
    }

    public String getOwner() {
        return owner;
    }

    public void addCow(Cow cow) {
        herd.add(cow);
    }

    public String printHerd() {
        String animals = "Animals:\n";
        for(Cow c : herd) {
            animals += "\t\t" + c + "\n";
        }
        return animals;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        barn.installMilkingRobot(milkingRobot);
    }

    public void manageCows() {
        barn.takeCareOf(herd);
    }

    @Override
    public void liveHour() {
        for(Cow c : herd) {
            c.liveHour();
        }
    }

    public String toString() {
        return "Farm owner: " + owner + "\n" + "Barn bulk tank: " + barn + "\n" + this.printHerd();
    }
}
