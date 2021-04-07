package com.demo.designpattern.structural.bridge;

//Caller class
public class BridgeCaller {

	public static void call() {
		System.out.println("***Bridge***");
		//Now the ConcreteBridge and WoodenBridge does not care about the implementation of Workshop.
		//They just call the work method of the implementation, now what implementation passes into the Refined abstract is unknown to it.
		//This way we can separate the implementation from the abstraction.
		AbstractBridge concreteBridge = new ConcreteBridge(new PillersWorkshop(), new ConcreteSlabWorkshop(),
				new CablesWorkshop());
		concreteBridge.constructBridge();

		AbstractBridge woodenBridge = new WoodenBridge(new WoodBlockWorkshop(), new CablesWorkshop());
		woodenBridge.constructBridge();

	}
}
