package net.likelion.bebc25.spring.lifecycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


//임시로 파일을 만들어서 파일에 로그를 출력
@Component
public class TempFileSupport {
    @Value("resources/temp.log")
    private String filePath;

    public TempFileSupport() {
        System.out.println("생성자 호출됨." + filePath);
        System.out.println(filePath + "경로의 fileoutputstream 생성 ???");
    }

    //비즈니스 메서드 호출 전 실행해야 할 작업
    public void init(String msg) {
        System.out.println(filePath + "에 로그 저장 : " + msg);
    }

    public void writeLong(String msg) {
        System.out.println("로그 저장: " + "에 로그 저장: " + msg);
    }
}
