package com.example.blogmanagementsystem.controller;

import com.example.blogmanagementsystem.entity.Post;
import com.example.blogmanagementsystem.service.PostService;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
    @GetMapping("/{id}")
    public Post getPost(@PathVariable long id) {
        return postService.getPostById(id);
    }

    @DeleteMapping("/{id}")
    public Post deletePost(@PathVariable long id) {
       return postService.deletePostById(id);
    }

    @PutMapping("/{id}")
    public Post updatePost(@PathVariable long id, @RequestBody Post post) {
        return postService.updatePost(post, id);
    }



}
