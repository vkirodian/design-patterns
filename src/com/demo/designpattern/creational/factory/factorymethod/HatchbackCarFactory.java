package com.demo.designpattern.creational.factory.factorymethod;

import com.demo.designpattern.creational.factory.Car;
import com.demo.designpattern.creational.factory.HatchbackCar;

public class HatchbackCarFactory extends AbstractCarFactory{
    @Override
    public Car constructCar() {
        return new HatchbackCar();
    }
}
