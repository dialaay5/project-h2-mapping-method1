package com.example.model;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public record Orders(@Id Integer id, String item, String customer, Integer price, Integer amount, LocalDate datee){
}
