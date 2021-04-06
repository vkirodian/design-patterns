package com.demo.structural.bridge;

//Concrete Implementor
public class ConcreteSlabWorkshop implements Workshop {

	@Override
	public void work() {
		System.out.println("Produce and Deliver Concrete Slabs");
	}

}
