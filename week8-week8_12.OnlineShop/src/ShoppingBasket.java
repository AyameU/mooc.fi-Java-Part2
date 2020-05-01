import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();

    public ShoppingBasket() {}

    public void add(String product, int price) {
        purchases.put(product, new Purchase(product, price, 1));
    }

    public int price() {
        int price = 0;

        for(Purchase purchase : purchases.values()) {
            price += purchase.price();
        }
        return price;
    }
}
