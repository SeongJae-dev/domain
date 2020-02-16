package com.demo.domain.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@Api(value = "main", description = "Home controller")
public class HomeController {

    @RequestMapping("/")
    public RedirectView Home(){

        return  new RedirectView( "redirect:/swagger-ui.html#/");
    }

}
