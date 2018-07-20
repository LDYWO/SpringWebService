package com.ldy.webservice.web;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    @GetMapping("/hello") // 매핑 주소
    public String hello() {
        return "HelloWorld";
    }

}

// @RestController --> @ResponseBody를 모든 메소드에서 적용해준다.
// 즉 hello 메소드의 결과는 Helloworld라는 문자열을 JSON 형태로 반환하게 된다.
// localhost:8080/hello 로 접속하면 간단한 Rest API가 호출된다.

