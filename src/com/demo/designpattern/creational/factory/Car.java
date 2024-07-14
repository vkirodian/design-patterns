package com.demo.designpattern.creational.factory;

/**
 * Represents the abstract concept of a Car in the factory design pattern.
 * This class serves as a blueprint for creating different types of cars.
 * It encapsulates common properties and functionalities that all cars share,
 * allowing for the extension and customization in subclasses.
 */
public abstract class Car {

	private final CarType carType;

	public Car(CarType carType) {
		this.carType = carType;
	}

	public abstract void driveCar();

	@Override
	public String toString() {
		return "Car [carType=" + carType + "]";
	}
	
	
}
