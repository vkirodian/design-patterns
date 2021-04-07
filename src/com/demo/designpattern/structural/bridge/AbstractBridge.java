package com.demo.designpattern.structural.bridge;

//Abstraction
public abstract class AbstractBridge {

	protected Workshop workshop1;
	protected Workshop workshop2;
	protected Workshop workshop3;

	public AbstractBridge(Workshop workshop1, Workshop workshop2, Workshop workshop3) {
		this.workshop1 = workshop1;
		this.workshop2 = workshop2;
		this.workshop3 = workshop3;
	}

	public abstract void constructBridge();
}
