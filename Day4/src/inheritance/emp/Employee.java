package inheritance.emp;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Employee {
	
	protected int empId;
	private String name;
	private double salary;
	
	public Employee() { // TODO Auto-generated constructor stub empId = 1001;
		empId = 1000;
		name = "Abc";
		salary = 10000.00;
		System.out.println("default constructor of Employee");
	}
	
	public Employee(int empId,String name,double salary) { // TODO Auto-generated constructor stub empId = 1001;
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		System.out.println("parameterized constructor of Employee");
	}
	
	public void display() {
		System.out.println("Employee's display");
		System.out.println("EmpId: " + empId + 
							"\tName: " + name + 
							"\tSalary: " + salary);	
	}

}
