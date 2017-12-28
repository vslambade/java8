package com.mt.demo;

interface Sayable1 {  
    void say();  
}  

public class MethodReferenceToInstanceMethod {
	
	public void saySomething(){  
        System.out.println("Hello, this is non-static method.");  
    }  
	
	public static void main(String[] args) {
		
		MethodReferenceToInstanceMethod methodReference = new MethodReferenceToInstanceMethod(); // Creating object
		
		// Referring non-static method using reference  
        Sayable1 sayable = methodReference::saySomething;
        
        // Calling interface method  
        sayable.say();  
        
        // Referring non-static method using anonymous object  
        Sayable1 sayable1 = new MethodReferenceToInstanceMethod()::saySomething;
        sayable1.say();
		
	}

}
