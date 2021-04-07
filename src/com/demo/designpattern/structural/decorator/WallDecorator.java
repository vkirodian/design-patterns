package com.demo.designpattern.structural.decorator;

//Concrete Decorator
public class WallDecorator extends HouseDecorator {

	public WallDecorator(House houseToDecorate) {
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
		System.out.println("Apply Paint");
	}

	@Override
	public void getRoof() {
		super.getRoof();
	}

}
