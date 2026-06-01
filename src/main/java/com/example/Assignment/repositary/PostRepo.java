package com.example.Assignment.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Assignment.entity.PostsEntity;

public interface PostRepo extends JpaRepository<PostsEntity, Integer> {

}
