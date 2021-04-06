package com.demo.creational.abstractfactory;

//Abstract Factory class
public class AbstractCarFactory {

	public static Car constructCar(CarType type) {

		//Configurable value either from config file or env variable, currently hard coded.
		//Depending on the location, we call the corresponding location factory and pass the car type to it.
		Location location = Location.Asia;

		Car car;
		switch (location) {
		case Europe:
			car = EuropeFactory.constructCar(type);
			break;
		case Asia:
			car = AsiaFactory.constructCar(type);
			break;
		default:
			throw new RuntimeException("Invalid Location");
		}
		return car;
	}
}
