package com.demo.creational.factory;

//Abstract class having 1 variable, we can create different type of cars.
public abstract class Car {

	private CarType carType;

	public Car(CarType carType) {
		this.carType = carType;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public abstract void constructCar();

	@Override
	public String toString() {
		return "Car [carType=" + carType + "]";
	}
	
	
}
