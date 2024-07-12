package com.demo.designpattern.creational.singleton;

/**
 * Implements the Singleton Design Pattern to ensure that only one instance of the Singleton class is created.
 * This class provides a global point of access to the instance through the {@code getInstance()} method.
 */
public class Singleton {

	/**
	 * The single instance of the Singleton class, initially null and lazily initialized.
	 */
	private static Singleton instance;

	/**
	 * Private constructor to prevent instantiation from outside the class.
	 */
	private Singleton() {
	}

	/**
	 * Provides a global point of access to the Singleton instance.
	 * This method is synchronized to prevent multiple threads from creating multiple instances in a multithreaded environment.
	 *
	 * @return The single instance of the Singleton class.
	 */
	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
