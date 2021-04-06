package com.demo.structural.adapter;

//Implementation
public class UKSocketImpl implements UKSocket {

	@Override
	public void threeRectangularPin() {
		System.out.println("Inserting into UK Socket");
	}

	@Override
	public void volts230And50Hz() {
		System.out.println("Providing UK Current");
	}

}
