package com.demo.structural.bridge;

//Concrete Implementor
public class PillersWorkshop implements Workshop {

	@Override
	public void work() {
		System.out.println("Produce and Deliver Pillers");
	}

}
