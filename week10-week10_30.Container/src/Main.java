import containers.*;

public class Main {

    public static void main(String[] args) {
        ProductContainer milk = new ProductContainer("Milk", 4000);
        milk.addToTheContainer(1000);
        milk.takeFromTheContainer(250);
        System.out.println(milk.getName());
        System.out.println(milk);

        System.out.println("\n------\nPart 3\n------\n");

        ContainerHistory history = new ContainerHistory();
        history.add(3.0);
        history.add(5.5);
        System.out.println(history);
        history.reset();
        System.out.println(history);

        System.out.println("\n------\nPart 4\n------\n");

        history.add(3.0);
        history.add(4.0);
        history.add(8.0);
        System.out.println(history);
        System.out.println(history.maxValue());
        System.out.println(history.minValue());
        System.out.println(history.average());

        System.out.println("\n------\nPart 5\n------\n");

        history.reset();
        history.add(99.0);
        history.add(99.0);
        System.out.println(history);
        System.out.println(history.average());
        System.out.println(history.variance());
        System.out.println(history.greatestFluctuation());
    }

}
