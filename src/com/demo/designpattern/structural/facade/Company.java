package com.demo.designpattern.structural.facade;

//Interface for subsystem
public interface Company {

	void preChecks();
	
	void work();
	
	void postChecks();
}
