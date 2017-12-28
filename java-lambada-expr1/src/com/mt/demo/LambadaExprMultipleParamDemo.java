package com.mt.demo;

interface Addable{  
    int add(int a,int b);  
}  

public class LambadaExprMultipleParamDemo {
	
	public static void main(String[] args) {
		
		//multiple parameter in lambda expression
		Addable add1 = (a,b)->{
			return a+b;
		};
		
		System.out.println(add1.add(10,20));  
		
		//or
		
		Addable add2=(int a,int b)->(a+b);
		System.out.println(add2.add(100,200));  
	}

}
