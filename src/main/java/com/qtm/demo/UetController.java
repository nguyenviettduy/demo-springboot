package com.qtm.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UetController {

    @RequestMapping("/")
    public String getInfo(){
        return "Hello world";
    }
}
