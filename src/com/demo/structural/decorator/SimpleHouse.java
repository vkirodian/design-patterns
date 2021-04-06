package com.demo.structural.decorator;

//Concrete Component
public class SimpleHouse implements House {

	//Decorate the original methods as required
	@Override
	public void getFloor() {
		System.out.println("Concrete Floor");
	}

	@Override
	public void getWalls() {
		System.out.println("Brick Walls");
	}

	@Override
	public void getRoof() {
		System.out.println("Concrete Roof");
	}

}
