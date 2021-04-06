package com.demo.creational.abstractfactory;

//Concrete implementation
//Car type is defined by the class itself but the location is configurable
public class SUVCar extends Car {

	public SUVCar(Location location) {
		super(CarType.SUV, location);
		constructCar(location);
	}

	@Override
	public void constructCar(Location location) {
		System.out.println("Constructed SUV Car at " + location);
	}

}
