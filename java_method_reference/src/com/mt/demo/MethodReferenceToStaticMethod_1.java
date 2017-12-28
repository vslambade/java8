package com.mt.demo;

public class MethodReferenceToStaticMethod_1 {

	public static void ThreadStatus() {
		System.out.println("Thread is running...");
	}

	public static void main(String[] args) {
		Thread t2 = new Thread(MethodReferenceToStaticMethod_1::ThreadStatus);
		t2.start();
	}

}
