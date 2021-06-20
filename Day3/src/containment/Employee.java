package containment;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 9-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */

import containment.date.MyDate;

// container object class
public class Employee {
	private int empId;
	private String name;
	
	// contained object
	private MyDate birthDate;
	
	public Employee() {
		// TODO Auto-generated constructor stub
		empId = 1001;
		name = "Xyz";
		birthDate = new MyDate();// creating contained object
		System.out.println("default constructor of Employee");
	}
	
	public Employee(int empId, String name, MyDate birthDate) {
		this.empId = empId;
		this.name = name;
		this.birthDate = birthDate;
		System.out.println("parameterized constructor of Employee");
	}
	
	public void display() {
		System.out.println("EmpId: " + empId + 
							"\tName: " + name + 
							"\tBirth Date: " + birthDate);	
	}
}
