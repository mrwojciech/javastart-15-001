package com.example.demo15_001;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {



    @GetMapping("/home")
  //  @ResponseBody
    public String home(){

        return "home";
    }
}
