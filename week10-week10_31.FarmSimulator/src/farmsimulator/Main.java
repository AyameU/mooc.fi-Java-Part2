package farmsimulator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        BulkTank tank = new BulkTank();
        tank.getFromTank(100);
        tank.addToTank(25);
        tank.getFromTank(5);
        System.out.println(tank);

        tank = new BulkTank(50);
        tank.addToTank(100);
        System.out.println(tank);

        BulkTank tank2 = new BulkTank(5782.4);
        tank2.addToTank(3232.13);
        tank2.addToTank(5000.99);
        tank2.addToTank(5000.0);
        tank2.getFromTank(1.5);
        System.out.println(tank2.getVolume());
        tank2.getFromTank(1432.1232);
        System.out.println(tank2.getVolume());
        tank2.getFromTank(50000.0);
        System.out.println(tank2.getVolume());
        System.out.println(tank2);

        Cow cow = new Cow();
        System.out.println(cow);

        System.out.println();
        System.out.println("31.2 - Cow");
        System.out.println();

        Alive livingCow = cow;
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();
        livingCow.liveHour();

        System.out.println(cow);

        Milkable milkingCow = cow;
        milkingCow.milk();

        System.out.println(cow);
        System.out.println();

        cow = new Cow("Ammu");
        System.out.println(cow);
        cow.liveHour();
        cow.liveHour();
        System.out.println(cow);
        cow.milk();
        System.out.println(cow);

        System.out.println();
        System.out.println("31.3 - Milking Robot");
        System.out.println();

        MilkingRobot milkingRobot = new MilkingRobot();
        Cow cow3 = new Cow();
        System.out.println();

        BulkTank tank3 = new BulkTank();
        milkingRobot.setBulkTank(tank3);
        System.out.println("Bulk tank: " + tank3);

        for(int i = 0; i < 2; i++) {
            System.out.println(cow3);
            System.out.println("Living..");
            for(int j = 0; j < 5; j++) {
                cow3.liveHour();
            }
            System.out.println(cow3);

            System.out.println("Milking...");
            milkingRobot.milk(cow3);
            System.out.println("Bulk tank: " + tank3);
            System.out.println();

            System.out.println();
            System.out.println("31.4 - Barn");
            System.out.println();

            Barn barn = new Barn(new BulkTank());
            System.out.println("Barn: " + barn);

            MilkingRobot robot = new MilkingRobot();
            barn.installMilkingRobot(robot);

            Cow ammu = new Cow();
            ammu.liveHour();
            ammu.liveHour();

            barn.takeCareOf(ammu);
            System.out.println("Barn: " + barn);

            LinkedList<Cow> cowList = new LinkedList<Cow>();
            cowList.add(ammu);
            cowList.add(new Cow());

            for(Cow c: cowList) {
                c.liveHour();
                c.liveHour();
            }

            barn.takeCareOf(cowList);
            System.out.println("Barn: " + barn);
        }
    }
}
