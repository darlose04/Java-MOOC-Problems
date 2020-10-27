/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.interfaces;

/**
 *
 * @author zach
 */

import java.util.ArrayList;

public class ReadingList implements Readable {
    private ArrayList<Readable> readables;
    
    public ReadingList() {
        this.readables = new ArrayList<>();
    }
    
    public void add(Readable readable) {
        this.readables.add(readable);
    }
    
    public int toRead() {
        return this.readables.size();
    }
    
    public String read() {
        String read = "";
        
        for (Readable readable : this.readables) {
            read = read + readable.read() + "\n";
        }
        
        // once the reading list has been read, we empty it
        this.readables.clear();
        return read;
    }
}
