package com.example.controller;

import com.example.model.Book;
import com.example.repository.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping
    public Iterable<Book> findall() {
        return bookRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Book getBookById(@PathVariable Integer id){
        return bookRepository.findById(id).get();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteBookById(@PathVariable Integer id){
        bookRepository.deleteById(id);
    }

    @PostMapping
    public Book postBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @PutMapping (value = "/{id}")
    public Book updateBook(@PathVariable Integer id, @RequestBody Book book){
        return bookRepository.save(book);
    }
}
