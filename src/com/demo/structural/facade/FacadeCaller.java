package com.demo.structural.facade;

//Caller class
public class FacadeCaller {

	// Client
	public static void call() {
		System.out.println("***Facade***");
		CompanyFacade cf = new CompanyFacade(Department.Finance);
		CompanyFacade cp = new CompanyFacade(Department.Production);
		
		cf.performTask();
		cp.performTask();
	}
}
