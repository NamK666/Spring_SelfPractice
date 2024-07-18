package com.example.springselfpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {

    @GetMapping("/index123")
    public String index(Model model) {
        model.addAttribute("name1", "어트리뷰트벨류값");
        model.addAttribute("name2", "또 연습해보자");

        int[] iterData = {1, 2, 3, 4, 5};
        model.addAttribute("iterData", iterData);

        return "index";
    }

    @GetMapping("/index/2")
    public String index2(Model model) {
        return "index2";
    }

    @PostMapping("/users")
    public String users(@ModelAttribute User user) {
        System.out.println("유저의 이름은 " + user.getUsername() + " 입니다.");
        System.out.println("유저의 이메일은" + user.getEmail() + " 입니다.");
        return "index2";
    }

    private List<Post> posts = new ArrayList<>();
    private Long nextId = 1L;
    
}
