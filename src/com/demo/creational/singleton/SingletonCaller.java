package com.demo.creational.singleton;

//Caller class.
public class SingletonCaller {

	public static void call() {
		System.out.println("***Singleton***");
		//Get the instance of the Singleton call to see each call returns the same object
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
		System.out.println(Singleton.getInstance().hashCode());
	}
}
