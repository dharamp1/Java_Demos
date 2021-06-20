package com.phoenix.designpatterns.main;

import com.phoenix.designpatterns.factory.Car;
import com.phoenix.designpatterns.factory.CarFactory;
import com.phoenix.designpatterns.singleton.Sun;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 16-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class DesignPatternMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Sun ob1 = Sun.getInstance(); Sun ob2 = Sun.getInstance(); Sun ob3 =
		 * Sun.getInstance(); Sun ob4 = Sun.getInstance(); ob4.light(); ob1.light();
		 * ob2.light(); ob3.light();
		 */
		
		String carType = args[0];
					// Invoking Factory Method
		Car car = CarFactory.newCar(carType);
		car.start();
		car.run();
		car.stop();
		
		
	}

}
