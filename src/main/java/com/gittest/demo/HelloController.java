package com.gittest.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("dev1 브랜치 생성!!");
        System.out.println("dev1 브랜치 또 생성!!");
        System.out.println("dev1 브랜치 또또 생성!!");
        return "hello world!";
    }
}
