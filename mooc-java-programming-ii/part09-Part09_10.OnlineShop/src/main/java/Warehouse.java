/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> warehouseMapPrices;
    private Map<String, Integer> warehouseMapStock;
    
    
    public Warehouse() {
        this.warehouseMapPrices = new HashMap<>();
        this.warehouseMapStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock) {
        warehouseMapPrices.put(product, price);
        warehouseMapStock.put(product, stock);
    }
    
    public int price(String product) {
        for (String key : warehouseMapPrices.keySet()) {
            if (key == product) {
                return warehouseMapPrices.get(key);
            }
        }
        
        return -99;
    }
    
    public int stock(String product) {
        for (String key : warehouseMapStock.keySet()) {
            if (key == product) {
                return warehouseMapStock.get(key);
            }
        }
        
        return 0;
    }
    
    public boolean take(String product) {
        for (String key : warehouseMapStock.keySet()) {
            if (key == product) {
                int stock = warehouseMapStock.get(key);
                if (stock > 0) {
                    stock -= 1;
                    warehouseMapStock.put(product, stock);
                    
                    return true;
                } else {
                    stock = 0;
                }
            }
        }
        
        return false;
    }
    
    public Set<String> products() {
        Set<String> keys = warehouseMapPrices.keySet();
        
        return keys;
    }
        
}
