package com.example.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
    @RequestMapping("/crabcake")
    public String crabPage() {
        return "crabcake";
    }
}
