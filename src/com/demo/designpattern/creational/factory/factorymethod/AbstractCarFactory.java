package com.demo.designpattern.creational.factory.factorymethod;

import com.demo.designpattern.creational.factory.Car;

/**
 * Abstract factory class for creating Car objects.
 * This class defines a common interface for creating various types of Car objects,
 * allowing for the implementation of factory method pattern where each concrete factory
 * class can decide how to instantiate Car objects.
 */
public abstract class AbstractCarFactory {

    public abstract Car constructCar();

}
