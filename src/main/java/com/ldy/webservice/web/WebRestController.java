package com.ldy.webservice.web;

import com.ldy.webservice.dto.PostsSaveRequestDto;
import com.ldy.webservice.service.PostsService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello") // 매핑 주소

    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public Long savePosts(@RequestBody PostsSaveRequestDto dto){
        return postsService.save(dto);
    }
}

// @RestController --> @ResponseBody를 모든 메소드에서 적용해준다.
// 즉 hello 메소드의 결과는 Helloworld라는 문자열을 JSON 형태로 반환하게 된다.
// localhost:8080/hello 로 접속하면 간단한 Rest API가 호출된다.

