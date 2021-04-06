package com.demo.creational.builder;

//Build the complex object as per Builders implementation passed to the director
public class HouseBuildingDirector {

	private HouseBuilder houseBuilder;

	//Pass a Builders implementation to invoke the corresponding build and get instance
	public HouseBuildingDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	public void construct() {
		houseBuilder.buildHouse();
	}

	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
