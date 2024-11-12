package com.SensorCommandCenter.WebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class UserController {


    @GetMapping("/")
    String getUsers(Model model) {
        model.addAttribute("something", "This is a val");
        return "users";
    }


}