package inheritance.emp.mgr;

import inheritance.emp.Employee;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Manager extends Employee {
	
	private float incentive;
	
	public Manager() {
		empId = 6705;
		incentive = 5000.00f;
		System.out.println("default constructor of Manager");
	}
	
	public Manager(int empId, String name, double salary, float incentives) {
		super(empId,name,salary); // super statement
		this.incentive = incentives;
		System.out.println("parameterized constructor of Manager");
	}
	
	// special method
	public void showIncentives() {
		System.out.println("Incentives: " + incentive);
	}
	
	
	public void displayM() {
		System.out.println("Manager's display");
		showIncentives();
		display();// super class display method
	}
}
