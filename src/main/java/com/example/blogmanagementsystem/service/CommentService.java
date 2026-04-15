package com.example.blogmanagementsystem.service;

import com.example.blogmanagementsystem.entity.Comment;
import com.example.blogmanagementsystem.repository.CommentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private CommentRepository commentRepository;

    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Comment addComment(Comment comment){
        return commentRepository.save(comment);
    }
    public List<Comment> getComments(){
        return commentRepository.findAll();
    }
    public void deleteCommentById(Long id){
        commentRepository.deleteById(id);
    }
}
