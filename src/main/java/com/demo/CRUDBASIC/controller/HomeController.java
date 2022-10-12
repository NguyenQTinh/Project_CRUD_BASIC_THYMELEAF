package com.demo.CRUDBASIC.controller;

import com.demo.CRUDBASIC.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HomeController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String test() {
        return "home";
    }
}
