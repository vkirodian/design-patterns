package com.demo.designpattern.behavioral.chainofresponsibility;

//Concrete handler
public class AuthenticationProcessor implements Processor {

	private Processor nextProcessor;

	@Override
	public void process(Request request) {
		System.out.println("Authenticating request : " + request.request);
		if (nextProcessor != null) {
			nextProcessor.process(request);
		}
	}

	@Override
	public Processor getNextProcessor() {
		return nextProcessor;
	}

	@Override
	public void setNextProcessor(Processor nextProcessor) {
		this.nextProcessor = nextProcessor;
	}

}
