package com.demo.designpattern.structural.composite;

//Leaf class
public class Engineer extends Employee {

	public Engineer(String name) {
		super(name);
	}

	// Leaf implementation
	@Override
	public void getEmployeeDetails(String tab) {
		System.out.println(tab + "Name : " + getName());
	}

}
