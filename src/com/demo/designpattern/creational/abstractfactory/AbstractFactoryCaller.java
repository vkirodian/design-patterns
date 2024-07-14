package com.demo.designpattern.creational.abstractfactory;

public class AbstractFactoryCaller {

	public static void call() {
		System.out.println("***Abstract Factory***");
		CarFactory asianSedanFactory = new AsiaSedanFactory();
		CarFactory europeSUVFactory = new EuropeSUVFactory();
		CarFactory EuropeHatchbackFactory = new EuropeHatchbackFactory();

		asianSedanFactory.manufactureCar().makeCar();
		asianSedanFactory.setFactoryLocation().manufacturingLocation();

		europeSUVFactory.manufactureCar().makeCar();
		europeSUVFactory.setFactoryLocation().manufacturingLocation();

		EuropeHatchbackFactory.manufactureCar().makeCar();
		EuropeHatchbackFactory.setFactoryLocation().manufacturingLocation();
	}
}
