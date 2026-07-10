package net.likelion.bebc25.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class TempFileSupport2 implements InitializingBean{

    private String filePath;

    public TempFileSupport2() {
        System.out.println("생성자 호출됨. " + filePath);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(filePath + " ");
    }
}