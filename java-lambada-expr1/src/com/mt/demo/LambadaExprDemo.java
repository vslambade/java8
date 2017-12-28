package com.mt.demo;

public class LambadaExprDemo {
	
	public static void main(String[] args) {
		
		System.out.println("java Lambada Expresiion Demo .....");
		
		//without lambada code is like 
		
		/*Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("This is run method call ... ");
			} 
		};*/
		
		//with lambada code is 
		Runnable runnable = ()->{
			System.out.println("This is lambada run method");
			};
		
		Thread th = new Thread(runnable);
		th.start();
		
	}

}
