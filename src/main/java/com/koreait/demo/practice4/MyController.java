package com.koreait.demo.practice4;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    @RequestMapping("/get")
    void get(){
        System.out.println("GET 요청을 받았습니다");
    }
}







