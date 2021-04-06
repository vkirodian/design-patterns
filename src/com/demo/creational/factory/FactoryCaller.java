package com.demo.creational.factory;

//Caller class
public class FactoryCaller {

	// See how we just provide the car type to the factory
	public static void call() {
		System.out.println("***Factory***");
		System.out.println(CarFactory.constructCar(CarType.Hatchback));
		System.out.println(CarFactory.constructCar(CarType.Sedan));
		System.out.println(CarFactory.constructCar(CarType.Hatchback));
	}
}
