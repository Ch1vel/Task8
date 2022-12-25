package org.example.web.controllers;

import org.example.web.entity.User;
import org.example.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/users")
    public String showUserList(Model model) {
        model.addAttribute("list",userService.getAllUser());
        return "listOfUsers";
    }

    @DeleteMapping("users/{id}/delete")
    public String deleteUser(@PathVariable("id") long id) {
        userService.removeUser(id);
        return "redirect:/users";
    }

    @GetMapping("/users/{id}/edit")
    public String editUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("user",userService.findUser(id));
        return "edit";
    }

    @PatchMapping("users/{id}")
    public String editUser(@PathVariable("id") long id,@ModelAttribute("user") User user) {
        userService.editUser(user);
        return "redirect:/users";
    }

}
