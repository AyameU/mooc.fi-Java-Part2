package farmsimulator;

import java.util.Random;

public class Cow implements Milkable, Alive{

    private Random rnd = new Random();

    private String name;
    private int udderCapacity;
    private double milkInCow = 0;
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    /**
     * Default Constructor
     */
    public Cow() {
        // Gets a random name from the NAMES array.
        int rndName = rnd.nextInt(NAMES.length);
        this.name = NAMES[rndName];
        udderCapacity = 15 + rnd.nextInt(26);
    }

    public Cow(String name) {
        this.name = name;
        udderCapacity = 15 + rnd.nextInt(26);
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return udderCapacity;
    }

    public double getAmount() {
        return milkInCow;
    }

    // Return the amount of milk milked from cow and resets milkInCow to 0.
    @Override
    public double milk() {
        double amountMilked = milkInCow;
        milkInCow = 0;
        return amountMilked;
    }

    // Adds to the milkInCow based a random
    @Override
    public void liveHour() {

        // Calculates the amount of milk produced in this hour.
        double milkProduction = 0;
        milkProduction += Math.ceil(0.7 + (2 - 0.7) * rnd.nextDouble());

        // Room left in cow to hold milk.
        double roomLeft = udderCapacity - this.getAmount();

        /* Check if there is enough room to add all of milk produced, then add the milk,
         * if not the milkInCow is set to equal to the total capacity.
         */
        if(roomLeft >= milkProduction) {
            milkInCow += milkProduction;
        }
        else if(roomLeft < milkProduction) {
            milkInCow = udderCapacity;
        }
    }

    public String toString() {
        return this.name + " " + this.getAmount() + "/" + udderCapacity;
    }
}
