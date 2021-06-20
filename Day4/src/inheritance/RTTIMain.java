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
public class RTTIMain {
	
	public static void showEmpInfo(Employee emp) {
		emp.display();
		
		if(emp instanceof Manager) 
			((Manager)emp).showIncentives();
	
		
		if(emp instanceof WageEmp) {
			WageEmp we = (WageEmp) emp;
			we.calculateWage();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Manager m1 = new Manager();
		showEmpInfo(m1);
		
		WageEmp we1 = new WageEmp();
		showEmpInfo(we1);
	}

}
