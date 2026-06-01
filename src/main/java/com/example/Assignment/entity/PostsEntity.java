package com.example.Assignment.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class PostsEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public int id;
public int userId;
public String title;
public String body;

}
