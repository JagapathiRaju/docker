package com.raju.docker.springdocker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class WelcomeRestController {

    @GetMapping("/welcomepage")
    public String welcomeToDocker(){
        return  "Hello Docker";
    }

}

