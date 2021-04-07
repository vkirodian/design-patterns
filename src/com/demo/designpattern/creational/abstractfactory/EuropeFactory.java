package com.demo.designpattern.creational.abstractfactory;

//Factory class corresponding to Europe location.
public class EuropeFactory {

	// Create instance of the car type depending on the car type passed by abstract
	// factory
	// Pass location to it.
	public static Car constructCar(CarType type) {
		Car car;
		switch (type) {
		case Hatchback:
			car = new HatchbackCar(Location.Europe);
			break;
		case Sedan:
			car = new SedanCar(Location.Europe);
			break;
		case SUV:
			car = new SUVCar(Location.Europe);
			break;
		default:
			throw new RuntimeException("Invalid Car Type");
		}
		return car;
	}
}
