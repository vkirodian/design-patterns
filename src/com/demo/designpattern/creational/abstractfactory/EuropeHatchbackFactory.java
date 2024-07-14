package com.demo.designpattern.creational.abstractfactory;

public class EuropeHatchbackFactory  implements CarFactory{
    @Override
    public Car manufactureCar() {
        return new HatchbackCar();
    }

    @Override
    public FactoryLocation setFactoryLocation() {
        return new EuropeFactory();
    }
}
