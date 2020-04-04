public class Main {
    public static void main(String[] Container) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }

    public static void addSuitcasesFullOfBricks(Container container) {
        for(int i = 1; i <= 100; i++) {

            // Create new brick, iterating the weight by 1 each loop
            Thing brick = new Thing("Brick", i);

            // Create new Suitcase
            Suitcase suitcase = new Suitcase(i);

            // Add one brick to suitcase
            suitcase.addThing(brick);

            // Add suitcase to container
            container.addSuitcase(suitcase);
        }
    }
}