package com.demo.designpattern.creational.factory.factorymethod;

import com.demo.designpattern.creational.factory.Car;
import com.demo.designpattern.creational.factory.SUVCar;

/**
 * Concrete factory for creating SUVCar objects.
 * Extends the AbstractCarFactory to implement the factory method pattern,
 * specifically for creating instances of SUVCar.
 */
public class SUVCarFactory extends AbstractCarFactory{
    @Override
    public Car constructCar() {
        return new SUVCar();
    }
}
