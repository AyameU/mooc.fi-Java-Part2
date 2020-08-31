package containers;

public class ProductContainerRecorder extends ProductContainer {

    private ContainerHistory history;

    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        super.addToTheContainer(initialVolume);

        history = new ContainerHistory();
        history.add(initialVolume);
    }

    public String history() {
        return history.toString();
    }

    public void addToTheContainer(double amount) {
        if(super.getCurrentCapacity() < amount) {
            super.addToTheContainer(super.getCurrentCapacity());
            history.add(super.getVolume());
        }
        else {
            super.addToTheContainer(amount);
            history.add(super.getVolume());
        }
    }

    public double takeFromTheContainer(double amount) {
        if(super.getVolume() - amount >= 0) {
            super.takeFromTheContainer(amount);
            history.add(super.getVolume());
            return amount;
        }
        else {
            Double amountAdded = 0.0;
            amountAdded = super.getCurrentCapacity();
            super.takeFromTheContainer(amountAdded);
            history.add(super.getVolume());
            return amountAdded;
        }
    }
}
