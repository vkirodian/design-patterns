package com.demo.designpattern.creational.factory;

//Concrete implementation
//Car type is defined by the class itself
public class SUVCar extends Car {

	public SUVCar() {
		super(CarType.SUV);
		constructCar();
	}

	@Override
	public void constructCar() {
		System.out.println("Constructed SUV Car");
	}

}
