package net.likelion.bebc25.spring.aop.staticproxy;


import net.likelion.bebc25.spring.aop.dynamicproxy.Car;
import net.likelion.bebc25.spring.aop.dynamicproxy.Driver;
import net.likelion.bebc25.spring.aop.dynamicproxy.HybridCar;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 스프링 컨테이너에 알려주는 앱 설정 클래스
@Configuration
public class AppConfig {
    @Bean
    public Car car () {
//        Car target = new GasolineCar();
        Car target = new HybridCar();
        Car logProxy = new LogProxy(target);
        return logProxy;
    }

    @Bean
    public Driver driver (Car car) {
        return new Driver(car);
    }
}
