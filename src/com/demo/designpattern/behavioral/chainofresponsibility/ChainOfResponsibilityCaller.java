package com.demo.designpattern.behavioral.chainofresponsibility;

//Caller class
public class ChainOfResponsibilityCaller {

	// Client
	public static void call() {
		System.out.println("***Chain of Responsibility***");
		Processor processor = ChainDefination.prepareChain();
		processor.process(new Request("This is a Hello World request"));
	}
}
