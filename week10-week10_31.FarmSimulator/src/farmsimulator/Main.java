package farmsimulator;

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

    }
}
