/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class DateMainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDateC d1 = new MyDateC(); // invoking default constructor
		d1.printDate();
		d1.setDay(23);
		d1.setMonth(5);
		d1.printDate();
		int dd = d1.getDay();
		System.out.println("Day: " + dd);
		System.out.println("Month: " + d1.getMonth());
		
		/*
		 * MyDateC d3 = new MyDateC(); // invoking default constructor d3.printDate();
		 * 
		 * MyDateC d2 = new MyDateC(8,6,2021); // invoking parameterized constructor
		 * d2.printDate();
		 * 
		 * MyDateC d4 = new MyDateC(12,8,1983); // invoking parameterized constructor
		 * d4.printDate();
		 */
	}

}
