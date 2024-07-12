package com.demo.designpattern.creational.singleton;

/**
 * The {@code SingletonCaller} class is responsible for demonstrating the Singleton design pattern.
 * It contains a static method {@code call()} that prints the hash codes of the Singleton instance
 * to illustrate that each call returns the same object instance, showcasing the Singleton behavior.
 */
public class SingletonCaller {

	public static void call() {
		System.out.println("***Singleton***");
		//Get the instance of the Singleton call to see each call returns the same object
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
	}
}
