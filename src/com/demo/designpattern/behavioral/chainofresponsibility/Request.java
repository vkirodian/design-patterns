package com.demo.designpattern.behavioral.chainofresponsibility;

public class Request {

	String request;

	public Request(String request) {
		this.request = request;
	}

	public String getRequest() {
		return request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

}
