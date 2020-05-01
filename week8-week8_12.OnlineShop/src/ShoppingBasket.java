import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> purchases = new HashMap<String, Purchase>();

    public ShoppingBasket() {}

    public void add(String product, int price) {
        int unitAmount = 1;

        if(purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        }
        else if(!purchases.containsKey(product)) {
            purchases.put(product, new Purchase(product, unitAmount, price));
        }
    }

    public int price() {
        int price = 0;

        for(Purchase purchase : purchases.values()) {
            price += purchase.price();
        }
        return price;
    }

    public void print() {
        for(Purchase purchase : purchases.values()) {
            System.out.println(purchase);
        }
    }
}
