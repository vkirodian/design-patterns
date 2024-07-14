package com.demo.designpattern.creational.factory.factorymethod;

import com.demo.designpattern.creational.factory.Car;
import com.demo.designpattern.creational.factory.SedanCar;

/**
 * Concrete factory for creating SedanCar objects.
 * Extends the AbstractCarFactory to implement the factory method pattern,
 * specifically for creating instances of SedanCar.
 */
public class SedanCarFactory extends AbstractCarFactory{
    @Override
    public Car constructCar() {
        return new SedanCar();
    }
}
