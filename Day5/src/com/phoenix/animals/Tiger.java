package com.phoenix.animals;

import com.phoenix.interfaces.Jumpable;
import com.phoenix.interfaces.Movable;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 14-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

// Role Based Inheritance as well as multiple inheritance
public class Tiger extends Animal implements Movable,Jumpable {
	
	public void eat() {
		System.out.println("Tiger eats....");
	}
	
	public void move() {
		System.out.println("Tiger moves..");
		System.out.println("Interface a: "+ Movable.a);
	}
	
	public void jump() {
		System.out.println("Tiger jumps..");
	}
}
