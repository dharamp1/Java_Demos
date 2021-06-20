/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 8-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class MyDateC {
	
	// Data Members
	private int day;
	private int month;
	private int year;
	
	// No-Argument or Default Constructor
	MyDateC(){
		
		/*
		 * day = month = 1; year = 2021;
		 */
		 
		this(12,12,1212); // this statement
		System.out.println("default constuctor of MyDateC");
	}
	
	// Parameterized Constructor
	MyDateC(int day,int m,int y){
		//this(); // invoking default constructor
		/*
		 * this.day = day; month = m; year = y;
		 */
		System.out.println("parameterized constuctor of MyDateC");
	}
	
	/*printDate() method is used 
	 * to print date object*/
	public void printDate() {
		System.out.println("Date is "+day +
									"/" + month + 
									"/" + year);
	}
	
	// Setter method for day
	public void setDay(int d) {
		day = d;
	}
	
	// Getter method for day
	public int getDay() {
		return day;
	}
	
	// Setter method for month
	public void setMonth(int month) {
		this.month = month;
	}
	
	// Getter method for month
	public int getMonth() {
		return month;
	}
}
