package com.demo.designpattern.creational.abstractfactory;

public class SUVCar implements Car {

	@Override
	public void makeCar() {
		System.out.println("SUV manufactured.");
	}
}
