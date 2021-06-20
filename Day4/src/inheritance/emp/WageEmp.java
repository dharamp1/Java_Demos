package inheritance.emp;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class WageEmp extends Employee {
	
	private int hours;
	private float ratePerHour;
	
	public WageEmp() {
		// TODO Auto-generated constructor stub
		hours = 8;
		ratePerHour = 200.0f;
		System.out.println("default constructor of WageEmp");
	}
	
	public WageEmp(int empId, String name, double salary, int hours, float rate) {
		// TODO Auto-generated constructor stub
		super(empId,name,salary);
		System.out.println("parameterized constructor of WageEmp");
	}
	
	// overridden method
	public void display() {
		System.out.println("WageEmp's display");
		super.display();
		System.out.println("Hours: " + hours + 
							"\tRate Per Hour: " + ratePerHour);
	}
	
	// special method
	public void calculateWage() {
		float wage = hours * ratePerHour;
		System.out.println("Wage: " + wage);
	}
	

}
