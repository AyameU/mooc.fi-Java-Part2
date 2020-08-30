package containers;

public class ProductContainer extends Container {

    private String productName;

    public ProductContainer(String productName, double capacity) {
        super(capacity);
        this.productName = productName;
    }

    public String getName() {
        return this.productName;
    }
}
