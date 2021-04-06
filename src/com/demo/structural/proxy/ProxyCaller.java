package com.demo.structural.proxy;

//Caller class
public class ProxyCaller {

	//Client uses proxy object instead of real object.
	static Internet ipxy = new InternetProxy();
	
	// Client
	public static void call() {
		System.out.println("***Proxy***");
		
		ipxy.connectToSite("google.com");
		ipxy.connectToSite("facebook.com");
		ipxy.connectToSite("stackoverflow.com");
	}
}
