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

public class VehicleRegistry {

    private HashMap<LicensePlate, String> directory;

    public VehicleRegistry() {
        this.directory = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        
        if (this.directory.containsKey(licensePlate)) {   
            return false;
        } else {
            this.directory.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate) {
        if (this.directory.containsKey(licensePlate)) {
            return this.directory.get(licensePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove(LicensePlate licensePlate) {
        if (this.directory.containsKey(licensePlate)) {
            this.directory.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates() {
        ArrayList<LicensePlate> licensePlates = new ArrayList<>();
        
        for (LicensePlate licensePlate : this.directory.keySet()) {
            licensePlates.add(licensePlate);
        }
        
        for (LicensePlate licensePlate : licensePlates) {
            System.out.println(licensePlate);
        }
    }
    
    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        
        for (String owner : this.directory.values()) {
            if (owners.contains(owner)) {
                continue;
            } else {
                owners.add(owner);
            }
        }
        
        for (String owner : owners) {
            System.out.println(owner);
        }
    }

}
