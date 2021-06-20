package inheritance.child;

import inheritance.emp.mgr.Manager;
import inheritance.parent.Parent;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 10-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Child extends Parent {
	
	// override method using covariant returntype
	public Manager getEmployee() {
		return new Manager();
	}

}
