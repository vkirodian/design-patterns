package com.demo.designpattern.structural.composite;

//Composite class
public class Manager extends Employee {

	public Manager(String name) {
		super(name);
	}

	// Composite implementation
	@Override
	public void getEmployeeDetails(String tab) {
		System.out.println(tab + "Name : " + getName());
		System.out.println(tab + "Subordinates : ");
		for (Employee e : employees) {
			e.getEmployeeDetails(tab+tab);
		}
	}

}
