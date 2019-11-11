import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String,Integer> prices;
    private Map<String,Integer> stock;

    public Storehouse(){
        this.prices = new HashMap<String,Integer>();
        this.stock = new HashMap<String,Integer>();
    }

    public void addProduct(String product, int price, int stock){
        this.prices.put(product,price);
        this.stock.put(product,stock);
    }

    public int price(String product){
        if (this.prices.get(product) == null){
            return -99;
        }
        return this.prices.get(product);
    }

    public int stock(String product){
        if (this.stock.get(product) == null){
            return 0;
        }
        return this.stock.get(product);
    }

    public boolean take(String product){
        if(stock(product) < 1){
            return false;
        }
        this.stock.put(product,(stock.get(product) - 1));
        return true;
    }

    public Set<String> products(){
        return this.prices.keySet();
    }

}
