package com.demo.designpattern.behavioral.chainofresponsibility;

public class ChainDefination {

	//Here we are creating a chain of processors.
	public static Processor prepareChain() {
		Processor serviceAssignment = new ServiceAssignmentProcessor();
		Processor authorization = new AuthorizationProcessor();
		authorization.setNextProcessor(serviceAssignment);
		Processor authentication = new AuthenticationProcessor();
		authentication.setNextProcessor(authorization);
		return authentication;
	}

}
