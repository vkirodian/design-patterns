package com.demo.creational.prototype;

import java.util.HashMap;
import java.util.Map;

//A prototype registry
public class PrototypeFactory {

	//Here we can create all the objects upfront and just return the initialized objects clone whenever requested for.
	private static Map<String, PrototypeCapable> map = new HashMap<>();

	//upfront init
	static {
		map.put("Sheep", new Sheep("Dolly"));
		map.put("Rat", new Rat("Jerry"));
	}

	//Request for new object would return the clone of fully init object.
	public static PrototypeCapable getInstance(String animal) {
		try {
			return map.get(animal).clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("Clone not supported");
		}
	}
}
