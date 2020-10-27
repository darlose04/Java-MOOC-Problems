/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Person;

/**
 *
 * @author zach
 */
public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;
    
    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }
    
    public boolean allowedToRide(Person person) {
        if (person.getHeight() < this.lowestHeight) {
            return false;
        }
        
        this.visitors++;
        return true;
    }
    
    public String toString() {
        return this.name + ", minimum height: " + this.lowestHeight + ", visitors: " + this.visitors;
    }
}
