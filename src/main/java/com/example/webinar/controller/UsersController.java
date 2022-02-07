package com.example.webinar.controller;

import com.example.webinar.model.Developer;
import com.example.webinar.model.User;
import com.example.webinar.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class UsersController {

    @Autowired
    private UsersRepository usersRepository;

    @GetMapping("/users")
    public String getUsersPage(Model model){
        List<User> users = usersRepository.findAll();
        model.addAttribute("users", users);
        return "users_page";
    }

    @PostMapping("/users")
    public String asd( Developer developer) {
//        System.out.println(req.getParameter("myString"));
        //model.addAttribute("numbers", developer.getNumbers());
        System.out.println(developer.toString());
        return "redirect:/users";
    }

//    @RequestMapping("/users")
//    public String display(HttpServletRequest req, Model m)
//    {
//        //read the provided form data
//        System.out.println(req.getParameter("myString"));
//
//            //add a message to the model
//           // m.addAttribute("message", "Hello ");
//            return "redirect:/users";
//
//
//    }
}

