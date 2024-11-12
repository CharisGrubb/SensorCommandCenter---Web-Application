package com.SensorCommandCenter.WebApplication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class Controller{

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/users")
    public String getUsers() {
        return "Return All users";
    }


}