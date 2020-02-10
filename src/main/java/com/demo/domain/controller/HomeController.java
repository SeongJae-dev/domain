package com.demo.domain.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "main", description = "Home controller")
public class HomeController {

//    @RequestMapping("/")
//    public String Home(){
//        return "Hello Test API";
//    }

}
