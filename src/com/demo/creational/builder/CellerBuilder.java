package com.demo.creational.builder;

////Implementation of builder interface.
//This implementation builds a Apartment.
public class CellerBuilder implements HouseBuilder {

	private House house;

	public CellerBuilder() {
		this.house = new House();
	}

	//Initializing the complex object as per requirement.
	@Override
	public void buildHouse() {
		house.setFloor("Concrete");
		house.setWalls("Concrete");
		house.setDoors("Wood");
		house.setRoof("Concrete");
	}

	//Get the fully initialized complex object.
	@Override
	public House getHouse() {
		return house;
	}

}
