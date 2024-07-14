package com.demo.designpattern.creational.abstractfactory;

public class EuropeSUVFactory implements CarFactory {
    @Override
    public Car manufactureCar() {
        return new SUVCar();
    }

    @Override
    public FactoryLocation setFactoryLocation() {
        return new EuropeFactory();
    }
}
