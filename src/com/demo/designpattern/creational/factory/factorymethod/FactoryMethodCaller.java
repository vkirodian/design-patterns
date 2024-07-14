package com.demo.designpattern.creational.factory.factorymethod;

/**
 * Demonstrates the use of the Factory Method Design Pattern in creating Car objects.
 * This class serves as a client that calls specific CarFactory implementations to create instances of Car
 * (SedanCar, SUVCar, HatchbackCar) and then drives them. It showcases how the factory method pattern
 * abstracts the instantiation logic into separate factories, allowing for easy creation and manipulation
 * of objects without needing to know the specific classes required for each car type.
 */
public class FactoryMethodCaller {

    public static void call() {
        System.out.println("***Factory Method***");
        new SedanCarFactory().constructCar().driveCar();
        new SUVCarFactory().constructCar().driveCar();
        new HatchbackCarFactory().constructCar().driveCar();
    }
}
