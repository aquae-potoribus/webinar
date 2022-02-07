package com.example.webinar.controller;

import com.example.webinar.model.User;
import com.example.webinar.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MyController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping ("/hello")
    public String HelloPage() {
        return "menu";
    }

    @GetMapping("/highscores")
    public String goodByePage(Model model){
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "highscores";
    }
}
