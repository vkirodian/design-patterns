package com.demo.creational.abstractfactory;

//Concrete implementation
//Car type is defined by the class itself but the location is configurable
public class HatchbackCar extends Car {

	public HatchbackCar(Location location) {
		super(CarType.Hatchback, location);
		constructCar(location);
	}

	@Override
	public void constructCar(Location location) {
		System.out.println("Constructed Hatchback Car at " + location);
	}

}
