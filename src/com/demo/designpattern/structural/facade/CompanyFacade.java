package com.demo.designpattern.structural.facade;

//Facade class
public class CompanyFacade {

	private Department dept;
	Company company;

	public CompanyFacade(Department dept) {
		this.dept = dept;
	}

	//This method hides all the complex tasks under one single method.
	public void performTask() {
		switch (dept) {
		case Finance:
			company = new FinanceDept();
			company.preChecks();
			company.work();
			company.postChecks();
			break;
		case Production:
			company = new ProductionDept();
			company.preChecks();
			company.work();
			company.postChecks();
			break;
		default:
			System.out.println("Undefined");
		}
	}
}
