package com.SensorCommandCenter.WebApplication;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {



    @GetMapping("/users")
    public String getUsers(Model model) {
        model.addAttribute("user_list", "Users:");
        return "users";
    }

    @GetMapping("/user")
    public String getUser(@RequestParam(name="username", required = false) String username, Model model) {
        model.addAttribute("something", "This is a val");
        return "User Details";
    }



}

