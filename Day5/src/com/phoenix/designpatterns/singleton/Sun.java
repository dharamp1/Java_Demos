package com.phoenix.designpatterns.singleton;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 16-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

// Singleton class using Single Design Pattern
public class Sun {
	
	// private static reference variable
	private static Sun ob;
	
	// private constructor
	private Sun() {
		System.out.println("Sun object is created");
	}
	
	// public static accessor method
	public static Sun getInstance() {
		System.out.println("getInstance() of Sun is called");
		if(ob==null)
			ob = new Sun();
		return ob;
	}
	
	// business logic method
	public void light() {
		System.out.println("Sun provides light");
	}
	
}
