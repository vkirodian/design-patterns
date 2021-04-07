package com.demo.designpattern.structural.flyweight;

//Concrete class
public class ThickPen implements Pen {

	private final PenType PENTYPE = PenType.Thick_Pen; // Intrinsic state - will be shared by all instance of this class
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
