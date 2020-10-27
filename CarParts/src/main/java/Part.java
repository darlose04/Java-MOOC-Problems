/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */
public class Part {
    private String identifier;
    private String manufacturer;
    private String description;
    
    public Part(String identifier, String manufacturer, String description) {
        this.identifier = identifier;
        this.manufacturer = manufacturer;
        this.description = description;
    }
    
    public String getIdentifier() {
        return identifier;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
}
