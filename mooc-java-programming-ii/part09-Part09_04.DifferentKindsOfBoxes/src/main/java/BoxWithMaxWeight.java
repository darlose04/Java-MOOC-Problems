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

public class BoxWithMaxWeight extends Box {

    private int capacity;
    private ArrayList<Item> items;

    public BoxWithMaxWeight(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if (item.getWeight() == 0) {
            items.add(item);
        }
        
        capacity -= item.getWeight();
        
        if (capacity >= 0) {
            items.add(item);
        }
        
    }

    @Override
    public boolean isInBox(Item item) {
        for (Item boxedItem : items) {
            if (item.equals(boxedItem)) {
                return true;
            }
        }
        return false;
    }

}
