package net.likelion.bebc25.initiallizr;

import org.springframework.stereotype.Component;

@Component
public class Driver {
    private Car car;


    // DI
    public Driver(Car car) {
        System.out.println("called Constructor: " + car);
        this.car = car;
    }

    public void driveCar(int maxSpeed) {
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
