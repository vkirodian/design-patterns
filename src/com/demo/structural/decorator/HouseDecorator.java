package com.demo.structural.decorator;

//Decorator
public abstract class HouseDecorator implements House {

	//Inject component into abstract decorator
	private House houseToDecorate;

	public HouseDecorator(House houseToDecorate) {
		this.houseToDecorate = houseToDecorate;
	}

	//Delegate all operations to concrete decorators
	@Override
	public void getFloor() {
		houseToDecorate.getFloor();
	}

	@Override
	public void getWalls() {
		houseToDecorate.getWalls();
	}

	@Override
	public void getRoof() {
		houseToDecorate.getRoof();
	}

}
