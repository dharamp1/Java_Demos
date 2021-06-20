package inheritance;

import inheritance.child.Child;
import inheritance.emp.Employee;
import inheritance.emp.mgr.Manager;
import inheritance.parent.Parent;

/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class CovariantMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		Employee e = p.getEmployee();
		e.display();
		
		Child c = new Child();
		Manager m = c.getEmployee();
		m.display();
		m.showIncentives();
		
	}

}
