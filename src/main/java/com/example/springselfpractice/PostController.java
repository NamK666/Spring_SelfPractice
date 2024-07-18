package com.example.springselfpractice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        Post post = posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("해당 게시글이 존재하지 않습니다. id: " + id));
        model.addAttribute("post", post);
        return "post/detail";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") Long id) {
        posts.removeIf(p -> p.getId() == id);
        return "redirect:/posts";
    }

    @GetMapping("{id}/edit") // 수정 페이지
    public String editForm(@PathVariable Long id, Model model) {
        Post post = posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 존재하지 않습니다. id: " + id));
        model.addAttribute("post", post);
        return "post/edit";
    }

    @PostMapping("{id}/edit")
    public String edit(@PathVariable("id") Long id, @ModelAttribute Post updatedPost) {
        Post post = posts.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 존재하지 않습니다. id: " + id));
        post.setTitle(updatedPost.getTitle());
        post.setContent(updatedPost.getContent());
        return "redirect:/posts/{id}";
    }

}
