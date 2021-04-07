package com.demo.designpattern.creational.singleton;

public class Singleton {

	// private static un-initialized instance of then class
	private static Singleton instance;

	// private constructor denying creation of object using new operator
	private Singleton() {
	}

	// static method returning the same instance of the class whenever asked for
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
