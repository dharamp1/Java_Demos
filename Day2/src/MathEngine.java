/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

// This class represent arithmetic functionality
public class MathEngine {
	
	// overloaded member methods
	public int add(int a,int b) {
		System.out.println("two int parameters");
		return a + b;
	}
	
	public void add(int a,int b,int c) {
		System.out.println("three int parameters");
		System.out.println(a+b+c);
		//return a + b;
	}
	
	public void add(int a,float b) {
		System.out.println("int & float parameters");
		System.out.println(a+b);
	}

	public void add(float a,int b) {
		System.out.println("float & int parameters");
		System.out.println(a+b);
	}
}
