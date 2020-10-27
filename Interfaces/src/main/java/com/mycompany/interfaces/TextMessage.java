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
public class TextMessage implements Readable {
    private String sender;
    private String content;
    
    public TextMessage(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }
    
    public String getSender() {
        return this.sender;
    }
    
    public String read() {
        return this.content;
    }
}
