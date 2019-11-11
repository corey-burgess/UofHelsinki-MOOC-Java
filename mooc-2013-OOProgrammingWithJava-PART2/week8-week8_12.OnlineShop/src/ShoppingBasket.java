import java.util.*;

public class ShoppingBasket {

    private Map<String,Purchase> basket;

    public ShoppingBasket(){
        basket = new HashMap<String,Purchase>();
    }

    public void add(String product, int price){
        if (basket.get(product) != null){
            basket.get(product).increaseAmount();
            return;
        }
        basket.put(product, new Purchase(product,1,price));
    }

    public int price(){
        int price = 0;
        for(Purchase purchase : basket.values()){
            price += purchase.price();
        }
        return price;
    }

    public void print(){
        for(Purchase purchase: basket.values()){
            System.out.println(purchase);
        }
    }


}
