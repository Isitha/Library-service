package com.example.libraryservice.controller;

import com.example.libraryservice.dto.BookRequest;
import com.example.libraryservice.model.Book;
import com.example.libraryservice.service.BookService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveBook(@RequestBody BookRequest bookRequest){
//        bookService.saveBook(bookRequest);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
