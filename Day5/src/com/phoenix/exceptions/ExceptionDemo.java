package com.phoenix.exceptions;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 16-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("start of main");
		try {
			int a = 10/2;
			System.out.println("Division: " + a);
			int arr[] = {10,20,30};
			for(int i=0;i<=arr.length;i++)
				System.out.println(arr[i]);
			
		}catch(ArithmeticException e) {
			//System.err.println("Error! can not divide by zero");
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			//System.err.println("Error! can not divide by zero");
			//System.err.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("end of main! normal termination");	
	}

}
