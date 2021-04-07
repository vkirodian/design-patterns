package com.demo.designpattern.creational.prototype;

//Implementing class, which has very high cost of creation, hence we would prefer to clone object whenever there is a request for one.
public class Rat implements PrototypeCapable {

	private String name;

	public Rat(String name) {
		this.name = name;
	}

	// Provides a clone of the object.
	@Override
	public Rat clone() throws CloneNotSupportedException {
		return (Rat) super.clone();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Rat [name=" + name + "]";
	}

}
