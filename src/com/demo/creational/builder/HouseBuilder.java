package com.demo.creational.builder;

//Builder interface that provides a framework to build the underlying complex object.
public interface HouseBuilder {

	void buildHouse();

	House getHouse();
}
