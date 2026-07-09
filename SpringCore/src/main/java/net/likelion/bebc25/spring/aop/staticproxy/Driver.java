package net.likelion.bebc25.spring.aop.staticproxy;


import net.likelion.bebc25.spring.aop.dynamicproxy.Car;

public class Driver {
    private Car car;


    // DI
    public Driver(Car car) {
        System.out.println("called Constructor");
        this.car = car;
    }

    public void driveCar() {
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
