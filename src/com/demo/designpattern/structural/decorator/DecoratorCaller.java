package com.demo.designpattern.structural.decorator;

//Caller class
public class DecoratorCaller {

	public static void call() {
		System.out.println("***Decorator***");
		// We first create the Simple House.
		// Now to decorate it, we inject it to a sequence of decorators
		House house = new FloorDecorator(new WallDecorator(new RoofDecorator(new SimpleHouse())));

		house.getFloor();
		house.getWalls();
		house.getRoof();
	}
}
