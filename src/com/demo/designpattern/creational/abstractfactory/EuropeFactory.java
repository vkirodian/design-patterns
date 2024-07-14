package com.demo.designpattern.creational.abstractfactory;

public class EuropeFactory implements FactoryLocation {

	@Override
	public void manufacturingLocation() {
		System.out.println("Car made in Europe.");
	}
}
