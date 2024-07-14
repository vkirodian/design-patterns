package com.demo.designpattern.creational.abstractfactory;

public class AsiaFactory implements FactoryLocation {


	@Override
	public void manufacturingLocation() {
		System.out.println("Car made in Asia.");
	}
}
