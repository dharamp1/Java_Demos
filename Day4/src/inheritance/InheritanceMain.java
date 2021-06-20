package inheritance;

import inheritance.emp.Employee;
import inheritance.emp.WageEmp;
import inheritance.emp.mgr.Manager;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class InheritanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Manager m1 = new Manager(7803,"Rohit Kapoor",28000.00,7000.00f);
		 * m1.display(); // Invoking inherited method m1.showIncentives(); // Invoking
		 * special method
		 * 
		 * Manager m2 = new Manager(); m2.display(); m2.showIncentives();
		 */
		
		/*
		 * Employee e1 = new Employee(); e1.display();
		 * 
		 * Manager m1 = new Manager(); m1.display();
		 */
		
		Employee ob;
		
		ob = new Manager();
		ob.display();
		
		((Manager)ob).showIncentives();
		
		ob = new WageEmp();
		ob.display();
		
		WageEmp we = (WageEmp)ob;
		we.calculateWage();
	}

}
