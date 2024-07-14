package com.demo.designpattern.creational.abstractfactory;

public class AsiaSedanFactory implements CarFactory {
    @Override
    public Car manufactureCar() {
        return new SedanCar();
    }

    @Override
    public FactoryLocation setFactoryLocation() {
        return new AsiaFactory();
    }
}
