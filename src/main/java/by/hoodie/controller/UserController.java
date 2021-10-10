package by.hoodie.controller;


import by.hoodie.entity.User;
import by.hoodie.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService = new UserService();

    @GetMapping("/reg")
    public String reg() {
        return "/reg";
    }

    @PostMapping("/reg")
    public String reg(User user) {
        userService.save(user);
        return "redirect:/";
    }

    @GetMapping("/auth")
    public String auth() {
        return "/auth";
    }

    @PostMapping("/auth")
    public String auth(User user, Model model, HttpSession httpSession) {
        User byUsername = userService.findByUsername(user.getUsername());
        if (byUsername != null) {
            if (byUsername.getPassword().equals(user.getPassword())){
                httpSession.setAttribute("user",byUsername);
                return "redirect:/";
            } else
                model.addAttribute("message", "Wrong Password!");
        } else {
            model.addAttribute("message", "User Not Found!");
        } return "/auth";
    }
}
