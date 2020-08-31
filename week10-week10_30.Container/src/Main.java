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

        System.out.println("\n------\nPart 6\n------\n");

        // the well known way:
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToTheContainer(1.0);
        System.out.println(juice); // Juice: volume = 989.7, free space 10.3

        // history() does not work properly, yet:
        System.out.println(juice.history()); // [1000.0]
        // in fact, we only retrieve the original value which was given to the constructor...

        System.out.println("\n------\nPart 7\n------\n");

        ProductContainerRecorder pop = new ProductContainerRecorder("Pop", 1000, 500);
        System.out.println(pop.history());
        pop.addToTheContainer(250);
        System.out.println(pop.history());
        pop.takeFromTheContainer(300);
        System.out.println(pop.history());
        pop.addToTheContainer(2500);
        System.out.println(pop.history());

        System.out.println("\n------\nPart 8\n------\n");

        ProductContainerRecorder juiceBox = new ProductContainerRecorder("Juice Box", 1000.0, 1000.0);
        juiceBox.takeFromTheContainer(11.3);
        juiceBox.addToTheContainer(1.0);
//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juiceBox.printAnalysis();
    }

}
