package net.likelion.bebc25.spring.lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringLifeCycleApplication {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(Appconfig.class)) {

            TempFileSupport support = context.getBean(TempFileSupport.class);
            support.writeLong("사용자가 로그인함");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}