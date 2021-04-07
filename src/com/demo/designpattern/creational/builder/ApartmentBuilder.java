package com.demo.designpattern.creational.builder;

//Implementation of builder interface.
//This implementation builds a Apartment.
public class ApartmentBuilder implements HouseBuilder {

	private House house;
	
	public ApartmentBuilder() {
		this.house = new House();
	}

	//Initializing the complex object as per requirement.
	@Override
	public void buildHouse() {
		house.setFloor("Concrete");
		house.setWalls("Bricks");
		house.setDoors("Wood");
		house.setWindows("Glass");
		house.setRoof("Concrete");
	}

	//Get the fully initialized complex object.
	@Override
	public House getHouse() {
		return house;
	}

}
