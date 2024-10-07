package org.cours.tp1.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot
{

    @RequestMapping("/hellospring")
    public String sayHello() {
        return "Hello me";

        // it s new controller

    }


}
