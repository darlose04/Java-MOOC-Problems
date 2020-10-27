/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zach
 */
public class Point3D extends Point {
    private int z;
    
    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
    
    @Override
    protected String location() {
        return super.location() + ", " + z; // has the form x, y, z
    }
    
    @Override
    public int manhattanDistanceFromOrigin() {
        // first adk the superclass for the distance based on x and y
        // and add the effect of the z coordinate to that result
        return super.manhattanDistanceFromOrigin() + Math.abs(z);
    }
    
    // since this toString method is the same as in Point, we don't need it
    
//    @Override
//    public String toString() {
//        return "(" + this.location() + ") distance " + this.manhattanDistanceFromOrigin();
//    }
}
