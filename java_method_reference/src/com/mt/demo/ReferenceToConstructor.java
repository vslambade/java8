/**
 * 
 */
package com.mt.demo;

/**
 * @author Vidyadhar
 *
 */

interface Messageable{  
    Message getMessage(String msg);  
}  

class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class ReferenceToConstructor {
	
	public static void main(String[] args) {
		
		Messageable hello = Message::new;
		hello.getMessage("This is reference to the constuctor . . .. ");
		
	}

}
