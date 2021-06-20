package demo.finals;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class FinalVariableDemo {
	
	// static( class variable) data member
	static final int b;
	
	static {
		b = 30;
	}

	
	public FinalVariableDemo() {
		// TODO Auto-generated constructor stub
		//b = 40;
	}
	
	
	
	public void test() {
		//b = 30;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a;
		a = 10;
		System.out.println(a);
		//a = 20;
		System.out.println(a);
		
	}

}
