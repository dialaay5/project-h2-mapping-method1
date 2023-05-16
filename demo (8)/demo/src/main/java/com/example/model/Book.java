package com.example.model;

import org.springframework.data.annotation.Id;

public record Book(@Id Integer id, String title, Integer pages, String author, Integer price) {

}