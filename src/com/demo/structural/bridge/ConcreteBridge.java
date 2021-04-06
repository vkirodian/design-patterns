package com.demo.structural.bridge;

//Refined Abstraction
public class ConcreteBridge extends AbstractBridge {

	public ConcreteBridge(Workshop workshop1, Workshop workshop2, Workshop workshop3) {
		super(workshop1, workshop2, workshop3);
	}

	@Override
	public void constructBridge() {
		System.out.println("Constructing Concrete Bridge");
		workshop1.work();
		workshop2.work();
		workshop3.work();
	}
}
