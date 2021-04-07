package com.demo.designpattern.structural.adapter;

//Implementation
public class USSocketImpl implements USSocket {

	@Override
	public void twoFlatAndGroundPin() {
		System.out.println("Inserting into US Socket");
	}

	@Override
	public void volts120And60Hz() {
		System.out.println("Providing US Current");
	}

}
