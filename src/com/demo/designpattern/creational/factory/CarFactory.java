package com.demo.designpattern.creational.factory;

/**
 * Factory class for creating instances of Car.
 * This class follows the Factory Design Pattern to abstract the instantiation logic of Car objects.
 * It provides a static method to create a Car instance based on the CarType.
 */
public class CarFactory {

	/**
     	* Creates and returns an instance of a Car based on the specified CarType.
     	* 
     	* @param type The type of car to create (Hatchback, Sedan, SUV).
     	* @return Car An instance of a Car subclass corresponding to the specified type.
     	* @throws RuntimeException if an invalid CarType is passed.
     	*/
	public static Car constructCar(CarType type) {
		Car car;
		switch (type) {
		case Hatchback:
			car = new HatchbackCar();
			break;
		case Sedan:
			car = new SedanCar();
			break;
		case SUV:
			car = new SUVCar();
			break;
		default:
			throw new RuntimeException("Invalid Car Type");
		}
		return car;
	}
}
