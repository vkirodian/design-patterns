package com.demo.creational.abstractfactory;

//Factory class corresponding to Asia location.
public class AsiaFactory {

	//Create instance of the car type depending on the car type passed by abstract factory
	//Pass location to it.
	public static Car constructCar(CarType type) {
		Car car;
		switch (type) {
		case Hatchback:
			car = new HatchbackCar(Location.Asia);
			break;
		case Sedan:
			car = new SedanCar(Location.Asia);
			break;
		case SUV:
			car = new SUVCar(Location.Asia);
			break;
		default:
			throw new RuntimeException("Invalid Car Type");
		}
		return car;
	}
}
