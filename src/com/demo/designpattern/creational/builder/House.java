package com.demo.designpattern.creational.builder;

/**
 * Represents a house with detailed attributes such as floor, walls, roof, doors, and windows.
 * This class encapsulates the complexity of a house object, providing a constructor to initialize
 * the house with specific attributes, and a toString method for representing the house's details as a string.
 */
public class House {

	private String floor;
	private String walls;
	private String roof;
	private String doors;
	private String windows;

	public House(String floor, String walls, String roof, String doors, String windows) {
		this.floor = floor;
		this.walls = walls;
		this.roof = roof;
		this.doors = doors;
		this.windows = windows;
	}

	@Override
	public String toString() {
		return "House [floor=" + floor + ", walls=" + walls + ", roof=" + roof + ", doors=" + doors + ", windows="
				+ windows + "]";
	}

}
