/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

// This is MyDate class representing date entity
public class MyDate {
	
	// data members
	private int day,month;
	private int year;
	
	//member methods
	/*initDate() method is used 
	 * to initialize date object*/
	public void initDate() {
		day = 8;
		month = 6;
		year = 2021;
	}
	
	/*printDate() method is used 
	 * to print date object*/
	public void printDate() {
		System.out.println("Date is "+day +
									"/" + month + 
									"/" + year);
	}
}// end of class
