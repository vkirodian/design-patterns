package com.demo.creational.prototype;

//Implementing class, which has very high cost of creation, hence we would prefer to clone object whenever there is a request for one.
public class Sheep implements PrototypeCapable {

	private String name;

	public Sheep(String name) {
		this.name = name;
	}

	// Provides a clone of the object.
	@Override
	public Sheep clone() throws CloneNotSupportedException {
		return (Sheep) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Sheep [name=" + name + "]";
	}

}
