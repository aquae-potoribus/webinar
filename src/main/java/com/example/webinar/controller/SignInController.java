package com.example.webinar.controller;

import com.example.webinar.model.User;
import com.example.webinar.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignInController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/signIn")
    public String GetSignInPage(){
        return "signIn_page";
    }

//    @GetMapping ("/game")
//    public String GetGamePage(){
//
//        return "game_page";
//    }

    @PostMapping("/signIn")
    public String signInUser(User user){
        usersRepository.save(user);
        return "redirect:/signIn";
    }

}
