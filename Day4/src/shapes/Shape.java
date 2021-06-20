package shapes;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public abstract class Shape {
	
	public static final float MATH_PI = 3.14f;
	
	abstract void calArea();
	
	public void show() {
		System.out.println("show");
	}

}
