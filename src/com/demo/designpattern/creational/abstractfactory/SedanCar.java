package com.demo.designpattern.creational.abstractfactory;

public class SedanCar implements Car {


	@Override
	public void makeCar() {
		System.out.println("Sedan manufactured.");
	}
}
