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
import java.util.List;

public class Herd implements Movable {
    private ArrayList<Movable> herd;
    
    public Herd() {
        this.herd = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable) {
        herd.add(movable);
    }
    
    public void move(int dx, int dy) {
        for (Movable object : herd) {
            object.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String herdByLine = "";
        
        for (Movable object : herd) {
            herdByLine += object.toString() + "\n";
        }
        
        return herdByLine;
    }
}
