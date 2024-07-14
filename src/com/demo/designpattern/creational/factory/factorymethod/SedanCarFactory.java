package com.demo.designpattern.creational.factory.factorymethod;

import com.demo.designpattern.creational.factory.Car;
import com.demo.designpattern.creational.factory.SedanCar;

public class SedanCarFactory extends AbstractCarFactory{
    @Override
    public Car constructCar() {
        return new SedanCar();
    }
}
