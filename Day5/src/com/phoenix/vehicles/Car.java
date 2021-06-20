package com.phoenix.vehicles;

import com.phoenix.interfaces.Movable;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 14-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class Car extends Vehicle implements Movable {
	
	public void move() {
		System.out.println("Car moves");
	}
}
