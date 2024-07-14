package com.demo.designpattern.creational.factory.factorymethod;

public class FactoryMethodCaller {

    public static void call() {
        System.out.println("***Factory Method***");
        new SedanCarFactory().constructCar().driveCar();
        new SUVCarFactory().constructCar().driveCar();
        new HatchbackCarFactory().constructCar().driveCar();
    }
}
