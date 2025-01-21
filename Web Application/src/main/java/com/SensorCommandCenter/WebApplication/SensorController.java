package com.SensorCommandCenter.WebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class SensorController {


        @GetMapping("/sensors")
    public String getSensors(Model model) {
        model.addAttribute("something", "This is a val");
        return "Sensors";
    }

    @GetMapping("/sensor")
    public String getSensor(Model model) {
        model.addAttribute("something", "This is a val");
        return "Sensor details";
    }
    
}
