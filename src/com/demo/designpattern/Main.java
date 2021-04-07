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

//Main caller
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
