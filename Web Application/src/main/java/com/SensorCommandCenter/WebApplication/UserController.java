package com.SensorCommandCenter.WebApplication;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {



    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("something", "This is a val");
        return "users";
    }

    @GetMapping("/user")
    public String getUser(Model model) {
        model.addAttribute("something", "This is a val");
        return "User Details";
    }



}

