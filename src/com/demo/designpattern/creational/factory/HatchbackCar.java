package com.demo.designpattern.creational.factory;

//Concrete implementation
//Car type is defined by the class itself
public class HatchbackCar extends Car {

	public HatchbackCar() {
		super(CarType.Hatchback);
	}

	@Override
	public void driveCar() {
		System.out.println("Driving Hatchback");
	}

}
