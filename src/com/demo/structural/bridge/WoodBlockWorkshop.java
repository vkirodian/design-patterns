package com.demo.structural.bridge;

//Concrete Implementor
public class WoodBlockWorkshop implements Workshop {

	@Override
	public void work() {
		System.out.println("Produce and Deliver Wood Block");
	}

}
