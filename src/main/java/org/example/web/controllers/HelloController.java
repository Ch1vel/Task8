package org.example.web.controllers;

import org.example.web.entity.User;
import org.example.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String welcomePage() {
        return "welcomePage";
    }

    @GetMapping("add")
    public String addUser(@ModelAttribute("user") User user){
        return "add";
    }

    @PostMapping
    public String addUserToBD(@ModelAttribute("user") User user){
        userService.add(user);
        return "redirect:/";
    }

}
