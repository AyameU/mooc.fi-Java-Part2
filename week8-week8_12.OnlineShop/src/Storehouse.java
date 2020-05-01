import java.util.HashMap;
import java.util.Map;

public class Storehouse {

    private Map<String, Integer> productPrices = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
    }

    public int price(String product) {
        if(!productPrices.containsKey(product)) {
            return -99;
        }
        return productPrices.get(product);
    }
}
