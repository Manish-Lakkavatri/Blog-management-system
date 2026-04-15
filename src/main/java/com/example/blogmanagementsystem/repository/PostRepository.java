package com.example.blogmanagementsystem.repository;

import com.example.blogmanagementsystem.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
