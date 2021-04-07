package com.demo.designpattern.structural.decorator;

public class RoofDecorator extends HouseDecorator {

	public RoofDecorator(House houseToDecorate) {
		super(houseToDecorate);
	}

	//Decorate the original methods as required
	@Override
	public void getFloor() {
		super.getFloor();
	}

	@Override
	public void getWalls() {
		super.getWalls();
	}

	@Override
	public void getRoof() {
		super.getRoof();
		System.out.println("Hang Lights");
	}

}
