package com.demo.designpattern;

import com.demo.designpattern.behavioral.chainofresponsibility.ChainOfResponsibilityCaller;
import com.demo.designpattern.creational.abstractfactory.AbstractFactoryCaller;
import com.demo.designpattern.creational.builder.BuilderCaller;
import com.demo.designpattern.creational.factory.FactoryCaller;
import com.demo.designpattern.creational.prototype.PrototypeCaller;
import com.demo.designpattern.creational.singleton.SingletonCaller;
import com.demo.designpattern.structural.adapter.AdapterCaller;
import com.demo.designpattern.structural.bridge.BridgeCaller;
import com.demo.designpattern.structural.composite.CompositeCaller;
import com.demo.designpattern.structural.decorator.DecoratorCaller;
import com.demo.designpattern.structural.facade.FacadeCaller;
import com.demo.designpattern.structural.flyweight.FlyweightCaller;
import com.demo.designpattern.structural.proxy.ProxyCaller;

/**
 * Main class of the design patterns demo project.
 *
 * This class serves as the entry point for demonstrating various design patterns implemented in the project.
 * It contains a main method that calls static methods from different caller classes, each representing
 * a specific design pattern category (creational, structural, behavioral).
 */
public class Main {

	public static void main(String[] args) {
		SingletonCaller.call();
		BuilderCaller.call();
		FactoryCaller.call();
		AbstractFactoryCaller.call();
		PrototypeCaller.call();
		
		AdapterCaller.call();
		BridgeCaller.call();
		CompositeCaller.call();
		DecoratorCaller.call();
		FacadeCaller.call();
		FlyweightCaller.call();
		ProxyCaller.call();
		
		ChainOfResponsibilityCaller.call();
	}

}
