package com.demo.designpattern.creational.factory.factorymethod;

import com.demo.designpattern.creational.factory.Car;
import com.demo.designpattern.creational.factory.HatchbackCar;

/**
 * Concrete factory for creating HatchbackCar objects.
 * Extends the AbstractCarFactory to implement the factory method pattern,
 * specifically for creating instances of HatchbackCar.
 */
public class HatchbackCarFactory extends AbstractCarFactory{
    @Override
    public Car constructCar() {
        return new HatchbackCar();
    }
}
