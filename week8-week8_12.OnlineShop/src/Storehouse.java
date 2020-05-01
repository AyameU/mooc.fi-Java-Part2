import java.util.HashMap;
import java.util.Map;

public class Storehouse {

    private Map<String, Integer> productPrices = new HashMap<String, Integer>();
    private Map<String, Integer> productStocks = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        productPrices.put(product, price);
        productStocks.put(product, stock);
    }

    public int price(String product) {
        if(!productPrices.containsKey(product)) {
            return -99;
        }
        return productPrices.get(product);
    }

    public int stock(String product) {
        if(productStocks.containsKey(product)) {
            return productStocks.get(product);
        }
        return 0;
    }

    public boolean take(String product) {
        if(!productStocks.containsKey(product)) {
            return false;
        }
        if(productStocks.get(product) == 0) {
            return false;
        }
        if(productStocks.get(product) > 0) {
            productStocks.put(product, productStocks.get(product) - 1);
            return true;
        }
        return false;
    }
}
