package com.demo.designpattern.behavioral.chainofresponsibility;

//Concrete handler
public class AuthorizationProcessor implements Processor {

	private Processor nextProcessor;

	@Override
	public void process(Request request) {
		System.out.println("Authorizing request : " + request.request);
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
