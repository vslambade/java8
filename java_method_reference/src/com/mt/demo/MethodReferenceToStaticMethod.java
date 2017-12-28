package com.mt.demo;

interface Sayable {
	void say();
}

class MethodReference {
	public static void saySomething() {
		System.out.println("Hello, this is static method.");
	}
}

public class MethodReferenceToStaticMethod {
	public static void main(String[] args) {
		
		 // Referring static method  
        Sayable sayable = MethodReference::saySomething;  
        
        // Calling interface method  
        sayable.say();  

	}
}
