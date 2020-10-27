/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */
public class Packer {
    private Factory factory;
    
    public Packer() {
        this.factory = new Factory();
    }
    
    public Box giveABoxOfThings() {
        Box box = new Box(100);
        
        int i = 0;
        while (i < 10) {
            Packable newThing = factory.produceNew();
            box.add(newThing);
            
            i += 1;
        }
        
        return box;
    }
}
