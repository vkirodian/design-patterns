package com.demo.designpattern.structural.facade;

//Subsystem
public class ProductionDept implements Company {

	@Override
	public void preChecks() {
		System.out.println("Wear Safty");
	}

	@Override
	public void work() {
		System.out.println("Work on production line");
	}

	@Override
	public void postChecks() {
		System.out.println("Return safty, clean up");
	}

}
