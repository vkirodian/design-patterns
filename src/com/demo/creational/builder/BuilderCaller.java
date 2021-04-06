package com.demo.creational.builder;

//Caller class.
public class BuilderCaller {

	public static void call() {
		// See how we pass the builder implementation to directory class, this would
		// give us an fully initialized complex object for that particular type.
		System.out.println("***Builder***");
		HouseBuildingDirector hbda = new HouseBuildingDirector(new ApartmentBuilder());
		HouseBuildingDirector hbdc = new HouseBuildingDirector(new CellerBuilder());

		hbda.construct();
		hbdc.construct();

		System.out.println(hbda.getHouse());
		System.out.println(hbdc.getHouse());
	}
}
