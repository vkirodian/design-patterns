package com.demo.creational.abstractfactory;

//Abstract class having 2 variables, we can create different type of cars for different locations.
public abstract class Car {

	private CarType carType;
	private Location location;

	public Car(CarType carType, Location location) {
		this.carType = carType;
		this.location = location;
	}

	public CarType getCarType() {
		return carType;
	}

	public void setCarType(CarType carType) {
		this.carType = carType;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public abstract void constructCar(Location location);

	@Override
	public String toString() {
		return "Car [carType=" + carType + ", location=" + location + "]";
	}

}
