package com.Corejava.startup;

public class Demo {
	static int staticCounter;
	int instanceCounter;                    
	void counter() {
		staticCounter++;
		instanceCounter++;
	}
	void displayCount(){
		System.out.println("Static count" + staticCounter);
		System.out.println("Instance count" + instanceCounter);
	}
	public static void main(String[] args) {
		Demo r1 = new Demo();
		Demo r2 = new Demo();
		Demo r3 = new Demo();
		r1.counter();
		r2.counter();
		r3.counter();
		r3.displayCount();
	}

}
