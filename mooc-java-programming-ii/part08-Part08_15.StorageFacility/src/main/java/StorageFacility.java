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
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> facilities;
    
    public StorageFacility() {
        this.facilities = new HashMap<>();
    }
    
    public void add(String unit, String item) {
        this.facilities.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> contents = this.facilities.get(unit);
        contents.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit) {
        if (this.facilities.containsKey(storageUnit)) {
            ArrayList<String> contents = this.facilities.get(storageUnit);
            return contents;
        } else {
            ArrayList<String> noContents = new ArrayList<>();
            return noContents;
        }
    }
    
    public void remove(String storageUnit, String item) {
        if (this.facilities.containsKey(storageUnit)) {
            ArrayList<String> contents = this.facilities.get(storageUnit);
            contents.remove(item);
            
            if (contents.size() == 0) {
                this.facilities.remove(storageUnit);
            }
        }
    }
    
    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        
        for (String unit : this.facilities.keySet()) {
            units.add(unit);
        }
        
        return units;
    }
}
