package com.demo.creational.prototype;

//Caller class.
public class PrototypeCaller {

	public static void call() {
		// When you request for an object, you would get object with same state but
		// distinct objects.
		// This means obj1.equals(obj2) will be true.
		// But obj1 == obj2 will be false, so is the object hashCode().
		System.out.println("***Prototype***");
		PrototypeCapable sheep1 = PrototypeFactory.getInstance("Sheep");
		PrototypeCapable rat1 = PrototypeFactory.getInstance("Rat");
		System.out.println(sheep1 + " " + sheep1.hashCode());
		System.out.println(rat1 + " " + rat1.hashCode());

		PrototypeCapable sheep2 = PrototypeFactory.getInstance("Sheep");
		PrototypeCapable rat2 = PrototypeFactory.getInstance("Rat");
		System.out.println(sheep2 + " " + sheep2.hashCode());
		System.out.println(rat2 + " " + rat2.hashCode());
	}
}
