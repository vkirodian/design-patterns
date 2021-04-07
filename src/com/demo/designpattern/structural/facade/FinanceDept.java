package com.demo.designpattern.structural.facade;

//Subsystem
public class FinanceDept implements Company {

	@Override
	public void preChecks() {
		System.out.println("Security Check");
	}

	@Override
	public void work() {
		System.out.println("Work on Company Finances");
	}

	@Override
	public void postChecks() {
		System.out.println("Security Check");
	}

}
