package net.likelion.bebc25.spring.aop.staticproxy;

import net.likelion.bebc25.spring.aop.dynamicproxy.AppConfig;
import net.likelion.bebc25.spring.aop.dynamicproxy.Driver;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringStaticProxyApplication {

    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver = context.getBean(Driver.class);

        driver.driveCar();
    }
}