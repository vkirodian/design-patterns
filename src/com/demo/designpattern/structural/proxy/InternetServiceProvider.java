package com.demo.designpattern.structural.proxy;

//Actual object
public class InternetServiceProvider implements Internet {

	@Override
	public void connectToSite(String site) {
		System.out.println("Connecting to " + site);
	}

}
