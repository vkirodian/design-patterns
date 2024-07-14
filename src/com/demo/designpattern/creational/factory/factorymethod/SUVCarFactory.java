package com.demo.designpattern.creational.factory.factorymethod;

import com.demo.designpattern.creational.factory.Car;
import com.demo.designpattern.creational.factory.SUVCar;

public class SUVCarFactory extends AbstractCarFactory{
    @Override
    public Car constructCar() {
        return new SUVCar();
    }
}
