package com.mt.demo;

//sayabele is a functional interface 
interface Sayable{  
    public String say(String name);  
}  

public class LambadaExprSingleParamDemo {
	
	public static void main(String[] args) {
		
		//lambada expression with single parameter 
		Sayable s1 = (name)->{
			return "Hello "+name;
		};
		
		System.out.println(s1.say("vidhyadhar"));
		
		//you can omit the function paranthessis
		Sayable s2 = name->{
				return name;
		};
		System.out.println(s1.say("ShreeKant"));
	}
	
}
