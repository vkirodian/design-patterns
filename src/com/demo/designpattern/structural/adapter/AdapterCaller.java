package com.demo.designpattern.structural.adapter;

//Caller class.
public class AdapterCaller {

	public static void call() {
		System.out.println("***Adapter***");
		//Creating instance for individual sockets
		UKSocketImpl ukSocket = new UKSocketImpl();
		USSocketImpl usSocket = new USSocketImpl();
		
		//Calling these sockets directly would give output as per their own implementation
		ukSocket.threeRectangularPin();
		ukSocket.volts230And50Hz();
		
		usSocket.twoFlatAndGroundPin();
		usSocket.volts120And60Hz();
		
		//Now if you inject USSocket instance to UKTOUS Adapter, the adapter even though has UKSocket methods,
		//It would output values from USSocket methods
		UKToUSAdapter adapter = new UKToUSAdapter(usSocket);
		adapter.threeRectangularPin();
		adapter.volts230And50Hz();
	}
}
