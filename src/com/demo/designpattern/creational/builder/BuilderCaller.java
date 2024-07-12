package com.demo.designpattern.creational.builder;

/**
 * The {@code BuilderCaller} class demonstrates the use of the Builder design pattern.
 * It showcases how to construct complex objects step by step using different builder implementations.
 * The class contains a static method {@code call()} that creates complex objects by directing
 * the construction process through the {@code HouseBuilder} class, using different builders
 * for constructing various types of houses (e.g., apartments, cellars).
 */
public class BuilderCaller {

	public static void call() {
		System.out.println("***Builder***");
		HouseBuilder apartmentBuilder = new HouseBuilder();
		apartmentBuilder.setFloor("Concrete").setWalls("Wood").setRoof("Shingles")
				.setDoors("Wood").setWindows("Glass");
		System.out.println(apartmentBuilder.buildHouse());

		HouseBuilder cellarBuilder = new HouseBuilder();
		cellarBuilder.setFloor("Dirt").setWalls("Stone").setRoof("Stone")
				.setDoors("Metal");
		System.out.println(cellarBuilder.buildHouse());
	}
}
