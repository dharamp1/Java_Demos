/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

// This is test class for method overloading functionality
public class OverloadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MathEngine ob = new MathEngine();
		
		int res = ob.add(2,6);
		System.out.println(res);
		ob.add(11, 30, 780);
		ob.add(6,4.5f);
		ob.add(6.0F,4);
	}

}
