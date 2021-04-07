package com.demo.designpattern.structural.bridge;

//Refined Abstraction
public class WoodenBridge extends AbstractBridge {

	public WoodenBridge(Workshop workshop1, Workshop workshop2) {
		super(workshop1, workshop2, null);
	}

	@Override
	public void constructBridge() {
		System.out.println("Constructing Wooden Bridge");
		workshop1.work();
		workshop2.work();
	}
}
