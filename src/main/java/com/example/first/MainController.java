package com.example.first;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    private final PersonRepo personRepo;

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @PostMapping("/search")
    public String findUser(@ModelAttribute("userId") Long userId, Model model) {
        Person person = personRepo.findById(userId).orElse(null);
        String name = (person != null) ? person.getName() : "User not found";
        model.addAttribute("userName", name);
        return "index";
    }
}
