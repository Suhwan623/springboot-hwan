package net.likelion.bebc25.spring.aop.springaop;

public class Driver {
    private Car car;


    // DI
    public Driver(Car car) {
        System.out.println("called Constructor: " + car);
        this.car = car;
    }

    public void driveCar() {
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
