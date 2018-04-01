package com.raju.docker.springdockerwithMaven.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class WelcomeRest{

    @GetMapping("/welcomepage")
    public String welcomeToDocker(){
        return  "Hello Docker";
    }

}