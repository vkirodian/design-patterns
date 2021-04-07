package com.demo.designpattern.behavioral.chainofresponsibility;

//Handler interface
public interface Processor {

	// method to process
	void process(Request request);

	// methods to assign next processors
	Processor getNextProcessor();

	void setNextProcessor(Processor nextProcessor);
}
