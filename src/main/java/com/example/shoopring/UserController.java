package com.example.shoopring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/")
    public String getMensage(){
        return "Spring boot is working";
    }
}
