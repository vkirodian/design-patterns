package com.demo.creational.factory;

//Factory for cars
public class CarFactory {

	//Depending on the type of car passed, we can create corresponding car class.
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
