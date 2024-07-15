package com.example.springselfpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymeleafController {

    @GetMapping("/index123")
    public String index(Model model) {
        model.addAttribute("name1", "어트리뷰트벨류값");
        model.addAttribute("name2","또 연습해보자");
        return "index";
    }
}
