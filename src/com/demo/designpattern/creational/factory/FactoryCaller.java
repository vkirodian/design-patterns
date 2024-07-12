package com.demo.designpattern.creational.factory;

/**
 * Demonstrates the use of the Factory Design Pattern in creating Car objects.
 * This class serves as a client that calls the CarFactory to create instances of Car
 * based on predefined types (Hatchback, Sedan, SUV). It showcases how the factory pattern
 * abstracts the instantiation logic, allowing for easy creation of objects without
 * needing to know the specific classes required for each car type.
 */
public class FactoryCaller {

	public static void call() {
		System.out.println("***Factory***");
		System.out.println(CarFactory.constructCar(CarType.Hatchback));
		System.out.println(CarFactory.constructCar(CarType.Sedan));
		System.out.println(CarFactory.constructCar(CarType.Hatchback));
	}
}
