package com.demo.creational.factory;

//Concrete implementation
//Car type is defined by the class itself
public class HatchbackCar extends Car {

	public HatchbackCar() {
		super(CarType.Hatchback);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Constructed Hatchback Car");
	}

}
