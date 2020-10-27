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

public class ChangeHistory {
    private ArrayList<Double> changeHistory;
    
    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }
    
    public void add(double status) {
        changeHistory.add(status);
    }
    
    public void clear() {
        changeHistory.clear();
    }
    
    public double maxValue() {
        double value = 0.0;
        
        if (changeHistory.size() == 0) {
            return 0.0;
        }
        
        for (double status : changeHistory) {
            if (status > value) {
                value = status;
            }
        }
        
        return value;
    }
    
    public double minValue() {
        if (changeHistory.size() == 0) {
            return 0.0;
        }
        
        double value = changeHistory.get(0);
        
        for (double status : changeHistory) {
            if (status < value) {
                value = status;
            }
        }
        
        return value;
    }
    
    public double average() {
        if (changeHistory.size() == 0) {
            return 0.0;
        }
        
        double total = 0.0;
        
        for (double status : changeHistory) {
            total += status;
        }
        
        double average = total / changeHistory.size();
        
        return average;
    }
    
    @Override
    public String toString() {
        return changeHistory.toString();
    }
}
