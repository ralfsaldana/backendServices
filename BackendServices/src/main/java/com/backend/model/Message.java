package com.backend.model;

import java.io.Serializable;
 
public class Message implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = -3713923617315027486L;
	String name;
    String text;
 
    public Message(){    
    	
    }
    
    public Message(String name, String text) {
        this.name = name;
        this.text = text;
    }
 
    public String getName() {
        return name;
    }
 
    public String getText() {
        return text;
    }
 
}