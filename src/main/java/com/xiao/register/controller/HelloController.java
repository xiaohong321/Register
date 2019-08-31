package com.xiao.register.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @email 1090176294@qq.com
 * @author: AAA
 * @date 2019/6/24
 * @time: 22:32
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        System.out.println("this is a hello test");
        return "Hello, world";
    }
}
