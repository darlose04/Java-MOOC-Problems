/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author zach
 */
public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();
        
        while (true) {
            System.out.println(clock);
            clock.advance();
        }
    }
}
