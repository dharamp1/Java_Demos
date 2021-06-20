package com.phoenix.animals;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 14-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public abstract class Animal {
	public abstract void eat();
	
	public void breath() {
		System.out.println("Animal breaths..");
	}
}
