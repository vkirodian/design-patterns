package com.demo.structural.decorator;

public class FloorDecorator extends HouseDecorator {

	public FloorDecorator(House houseToDecorate) {
		super(houseToDecorate);
	}

	@Override
	public void getFloor() {
		super.getFloor();
		System.out.println("Lay Tiles");
	}

	@Override
	public void getWalls() {
		super.getWalls();
	}

	@Override
	public void getRoof() {
		super.getRoof();
	}

}
