package com.demo.structural.flyweight;

//Caller class
public class FlyweightCaller {

	// Client
	public static void call() {
		System.out.println("***Flyweight***");
		PenFactory pf = new PenFactory();

		Pen pen1 = pf.getPen(PenType.Thick_Pen, "Red");
		pen1.draw();

		Pen pen2 = pf.getPen(PenType.Thin_Pen, "Blue");
		pen2.draw();

		Pen pen3 = pf.getPen(PenType.Medium_Pen, "Green");
		pen3.draw();

		Pen pen4 = pf.getPen(PenType.Thick_Pen, "Green");
		pen4.draw();

		Pen pen5 = pf.getPen(PenType.Thin_Pen, "Blue");
		pen5.draw();

		System.out.println("Pen1 " + pen1.hashCode());
		System.out.println("Pen2 " + pen2.hashCode());
		System.out.println("Pen3 " + pen3.hashCode());
		System.out.println("Pen4 " + pen4.hashCode());
		System.out.println("Pen5 " + pen5.hashCode());
	}
}
