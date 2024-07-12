package com.demo.designpattern.creational.builder;

/**
 * The {@code HouseBuilder} class provides a fluent interface for constructing a {@code House} object.
 * It allows for setting various properties of a house, such as floor, walls, roof, doors, and windows,
 * through a chainable method pattern. This class follows the Builder design pattern to simplify the construction
 * of complex {@code House} objects. Once all desired properties are set, the {@code buildHouse} method
 * can be used to create an instance of {@code House}.
 */
public class HouseBuilder {

	private String floor;
	private String walls;
	private String roof;
	private String doors;
	private String windows;

	public HouseBuilder setFloor(String floor) {
		this.floor = floor;
		return this;
	}

	public HouseBuilder setWalls(String walls) {
		this.walls = walls;
		return this;
	}

	public HouseBuilder setRoof(String roof) {
		this.roof = roof;
		return this;
	}

	public HouseBuilder setDoors(String doors) {
		this.doors = doors;
		return this;
	}

	public HouseBuilder setWindows(String windows) {
		this.windows = windows;
		return this;
	}

	public HouseBuilder() {
	}

	public House buildHouse() {
		House house = new House(this.floor, this.walls, this.roof, this.doors, this.windows);
		return house;
	}
}
