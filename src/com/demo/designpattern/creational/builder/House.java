package com.demo.designpattern.creational.builder;

//Actual complex object that needs to be created, but we want to hide this complexity.
public class House {

	private String floor;
	private String walls;
	private String roof;
	private String doors;
	private String windows;

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getWalls() {
		return walls;
	}

	public void setWalls(String walls) {
		this.walls = walls;
	}

	public String getRoof() {
		return roof;
	}

	public void setRoof(String roof) {
		this.roof = roof;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getWindows() {
		return windows;
	}

	public void setWindows(String windows) {
		this.windows = windows;
	}

	@Override
	public String toString() {
		return "House [floor=" + floor + ", walls=" + walls + ", roof=" + roof + ", doors=" + doors + ", windows="
				+ windows + "]";
	}

}
