package net.likelion.bebc25.oop.spring;


public class Driver {
    private Car car;


    // DI
    public Driver(Car car) {
        this.car = car;
    }

    public void driveCar() {
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
