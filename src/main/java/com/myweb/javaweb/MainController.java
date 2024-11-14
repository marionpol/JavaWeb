package com.myweb.javaweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("")
    public String showHomePage () {
        System.out.println("Home page");
        return "index";
    }
}
