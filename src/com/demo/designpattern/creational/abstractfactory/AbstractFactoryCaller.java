package com.demo.designpattern.creational.abstractfactory;

//Caller class
public class AbstractFactoryCaller {

	// See how we just provide the car type to the abstract factory, the locatoin
	// variable can be set via configuration
	// Environment variable etc
	public static void call() {
		System.out.println("***Abstract Factory***");
		System.out.println(AbstractCarFactory.constructCar(CarType.Hatchback));
		System.out.println(AbstractCarFactory.constructCar(CarType.Sedan));
		System.out.println(AbstractCarFactory.constructCar(CarType.Hatchback));
	}
}
