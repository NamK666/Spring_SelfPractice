package com.example.springselfpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/posts")
public class PostController {

    private List<Post> posts = new ArrayList<>();
    private Long nextId = 1L;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("posts", posts);
        return "post/list.html";
    }

    @GetMapping("/new")
    public String newPostForm(Model model) {
        model.addAttribute("post", new Post());
        return "post/new";
    }

    @PostMapping
    public String savePost(@ModelAttribute("post") Post post) {
        post.setId(nextId++);
        post.setCreatedAt(LocalDateTime.now());
        posts.add(post);
        return "redirect:/posts";
    }

}
