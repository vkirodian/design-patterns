package com.demo.designpattern.creational.abstractfactory;

public class HatchbackCar implements Car {

	@Override
	public void makeCar() {
		System.out.println("Hatchback manufactured.");
	}
}
