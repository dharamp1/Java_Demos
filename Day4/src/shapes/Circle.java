package shapes;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Circle extends Shape {
	
	private float radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
		radius = 2.5f;
	}
	
	public Circle(float radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}
	

	void calArea() {
		// TODO Auto-generated method stub
		float areaOfCircle = MATH_PI * radius * radius;
		System.out.println("Area of Circle: " + areaOfCircle);
	}
}
