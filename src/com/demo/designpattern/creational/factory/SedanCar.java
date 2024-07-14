package com.demo.designpattern.creational.factory;

//Concrete implementation
//Car type is defined by the class itself
public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.Sedan);
	}

	@Override
	public void driveCar() {
		System.out.println("Driving Sedan");
	}

}
