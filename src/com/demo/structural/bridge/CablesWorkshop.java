package com.demo.structural.bridge;

//Concrete Implementor
public class CablesWorkshop implements Workshop {

	@Override
	public void work() {
		System.out.println("Produce and Deliver Cables");
	}

}
