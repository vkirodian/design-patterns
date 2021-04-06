package com.demo;

import com.demo.creational.abstractfactory.AbstractFactoryCaller;
import com.demo.creational.builder.BuilderCaller;
import com.demo.creational.factory.FactoryCaller;
import com.demo.creational.prototype.PrototypeCaller;
import com.demo.creational.singleton.SingletonCaller;
import com.demo.structural.adapter.AdapterCaller;
import com.demo.structural.bridge.BridgeCaller;
import com.demo.structural.composite.CompositeCaller;
import com.demo.structural.decorator.DecoratorCaller;
import com.demo.structural.facade.FacadeCaller;
import com.demo.structural.flyweight.FlyweightCaller;
import com.demo.structural.proxy.ProxyCaller;

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
	}

}
