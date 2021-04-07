package com.demo.designpattern.structural.adapter;

//Adapter implements the interface that the client wishes to use.
//Here our client would use methods of UKSocket.
//But it expects output of USSocket.
public class UKToUSAdapter implements UKSocket {

	//Inject USSocket or the socket whose output is required.
	private USSocket usSocket;

	public UKToUSAdapter(USSocket usSocket) {
		this.usSocket = usSocket;
	}

	@Override
	public void threeRectangularPin() {
		usSocket.twoFlatAndGroundPin();
	}

	@Override
	public void volts230And50Hz() {
		usSocket.volts120And60Hz();
	}

}
