package com.demo.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

//Component
public abstract class Employee {

	// Generic property that can be used by composite class and leaf class
	private String name;

	// creating a group of component, to be used by composite class.
	protected List<Employee> employees = new ArrayList<>();

	public Employee(String name) {
		this.name = name;
	}

	// This method is valid for composite class as well as leaf class as well.
	public abstract void getEmployeeDetails(String tab);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	// Below methods are valid for a composite class only
	public void addEmployee(Employee e) {
		employees.add(e);
	}

	public void removeEmployee(Employee e) {
		employees.remove(e);
	}
}
