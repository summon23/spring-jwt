package com.summon23.springjwt.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(name = "core")
public class CoreController {

    @GetMapping(name = "main")
    public String accessPage() {
        return "TADA";
    }
}
