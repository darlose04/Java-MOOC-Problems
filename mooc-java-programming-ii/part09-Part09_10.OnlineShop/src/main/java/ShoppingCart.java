/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Collection;
import java.util.Set;

public class ShoppingCart {

    private Map<String, Item> items;

    public ShoppingCart() {
        this.items = new HashMap<>();
    }

    public void add(String product, int price) {
        
        if (items.containsKey(product)) {
            items.get(product).increaseQuantity();
        } else {
            items.put(product, new Item(product, 1, price));
        }
    }

    public int price() {
        int totalPrice = 0;

        Collection<Item> values = items.values();

        for (Item value : values) {
            totalPrice = totalPrice + value.price();
        }

        return totalPrice;
    }

    public void print() {
        Collection<Item> values = items.values();

        for (Item value : values) {
            System.out.println(value);
        }
    }
}
