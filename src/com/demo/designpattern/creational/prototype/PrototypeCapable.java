package com.demo.designpattern.creational.prototype;

//This interface extends clonable to indicate the same.
public interface PrototypeCapable extends Cloneable {
	//Method to clone an object
	public PrototypeCapable clone() throws CloneNotSupportedException;
}
