package net.likelion.bebc25.spring.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Driver {
    @Autowired // 필드 injection
    private Car car;

//    Driver () {
//        System.out.println("Driver 기본 생성자 호출됨");
//    }
//
//    // DI
//    @Autowired
//    public Driver(@Qualifier("gasolineCar") Car car) {
//        System.out.println("called Constructor: " + car);
//        this.car = car;
//    }

    public void driveCar(int maxSpeed) {
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
