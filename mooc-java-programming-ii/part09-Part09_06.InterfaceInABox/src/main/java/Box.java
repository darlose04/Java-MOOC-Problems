/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */

import java.util.ArrayList;

public class Box implements Packable {
    private double capacity;
    private ArrayList<Packable> packables;
    
    public Box(double capacity) {
        this.capacity = capacity;
        this.packables = new ArrayList<>();
    }
    
    public void add(Packable packable) {
        if (packable.weight() <= capacity) {
            this.packables.add(packable);
            this.capacity -= packable.weight();
        }
    }
    
    public double weight() {
        double totalWeight = 0;
        
        for (Packable packable : packables) {
            totalWeight += packable.weight();
        }   
        
        return totalWeight;
    }
    
    @Override
    public String toString() {
        return "Box: " + packables.size() + " items, total weight " + this.weight() + " kg";
    }
}
