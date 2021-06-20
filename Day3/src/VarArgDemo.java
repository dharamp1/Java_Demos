/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 9-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class VarArgDemo {
	
	// method with variable argument
	public static void sum(int...v) {
		System.out.println("Size of var-arg: "+v.length);
		int total=0;
		for(int ele:v)
			total+=ele;
		System.out.println("Sum: " + total);
	}
	
	public static void sum(int x, int y) {
		System.out.println("x:" + x);
		System.out.println("y:" + y);
	}
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
	}

}
