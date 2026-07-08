package net.likelion.bebc25.oop.spring;

import net.likelion.bebc25.oop.after.Car;
import net.likelion.bebc25.oop.after.Driver;
import net.likelion.bebc25.oop.after.GasolineCar;

public class AfterTest {
    void main(){
        Car car = new GasolineCar();
        net.likelion.bebc25.oop.after.Driver driver = new Driver(car);
        driver.driveCar();
    }
}
