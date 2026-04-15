package com.example.blogmanagementsystem.service;

import com.example.blogmanagementsystem.entity.Post;
import com.example.blogmanagementsystem.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository postRepository;
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Post createPost(Post post){
        return postRepository.save(post);
    }

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post getPostById(Long id){
        return postRepository.findById(id).orElse(null);
    }

    public Post deletePostById(Long id){
        postRepository.deleteById(id);
        return null;
    }

    public Post updatePost(Post updatedPost, Long id){
        Post post = postRepository.findById(id).orElse(null);
        if(post != null){
            post.setTitle(updatedPost.getTitle());
            post.setContent(updatedPost.getContent());
            return postRepository.save(post);
        }
        return null;
    }
}
