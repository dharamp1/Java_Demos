package com.phoenix.interfaces.main;

import com.phoenix.animals.Animal;
import com.phoenix.animals.Tiger;
import com.phoenix.interfaces.Jumpable;
import com.phoenix.interfaces.Movable;
import com.phoenix.planets.Earth;
import com.phoenix.vehicles.Car;
import com.phoenix.vehicles.Vehicle;
/*
 * Author: dharmaraj.pawale@stl.tech
 * Creation Date: 14-Jun-2021
 * Version: 1.0
 * Copyright: Sterlite Technologies Ltd.
 */
public class InterfaceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m = null;
		
		m = new Car();
		m.move();
		Vehicle v = (Vehicle)m;
		v.start();
		v.stop();
		
		m = new Tiger();
		m.move();
		((Jumpable)m).jump();
		Animal a = (Animal)m;
		a.eat();
		a.breath();
		
		m = new Earth();
		m.move();
		
		System.out.println(Movable.a);
	}

}
