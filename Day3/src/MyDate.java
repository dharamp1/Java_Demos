/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 9-Jun-2021
 * Version: 2.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class MyDate {
	// Data Members
		private int day;
		private int month;
		private int year;
		
		// No-Argument or Default Constructor
		MyDate(){
			day = month = 1;
			year = 2021;
			System.out.println("default constuctor of MyDate");
		}
		
		// Parameterized Constructor
		MyDate(int day,int m,int y){
			this.day = day;
			month = m;
			year = y;
			System.out.println("parameterized constuctor of MyDate");
		}
		
		/*printDate() method is used 
		 * to print date object*/
		public void printDate() {
			System.out.println("Date is "+day +
										"/" + month + 
										"/" + year);
		}
		
		public String toString() {
			return day +"-" + month + "-" + year;
		}
}
