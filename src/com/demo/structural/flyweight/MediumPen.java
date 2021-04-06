package com.demo.structural.flyweight;

//Concrete class
public class MediumPen implements Pen {

	private final PenType PENTYPE = PenType.Medium_Pen; // Intrinsic state - will be shared by all instance of this
														// class
	private String color; // Extrinsic state - supplied by client

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Drawing with a " + PENTYPE + " of color " + color);
	}

}
