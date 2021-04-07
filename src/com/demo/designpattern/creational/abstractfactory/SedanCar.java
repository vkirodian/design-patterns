package com.demo.designpattern.creational.abstractfactory;

//Concrete implementation
//Car type is defined by the class itself but the location is configurable
public class SedanCar extends Car {

	public SedanCar(Location location) {
		super(CarType.Sedan, location);
		constructCar(location);
	}

	@Override
	public void constructCar(Location location) {
		System.out.println("Constructed Sedan Car at " + location);
	}

}
