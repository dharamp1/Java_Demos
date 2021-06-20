package com.phoenix.designpatterns.factory;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 16-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */

// Factory Method class using Factory Design Pattern
public class CarFactory {
	
	// Factory Method
	public static Car newCar(String carType) {
		
		if(carType.equals("Sedan"))
			return new SedanCar();
		else if(carType.equals("Couple"))
			return new CoupleCar();
		else if(carType.equals("Sport"))
			return new SportCar();
		else if(carType.equals("Luxury"))
			return new LuxuryCar();
		else
			return null;
		
	}

}
