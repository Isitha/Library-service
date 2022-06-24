package com.example.libraryservice.service;

import com.example.libraryservice.dto.BookRequest;
import com.example.libraryservice.model.Book;
import com.example.libraryservice.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public void saveBook(BookRequest bookRequest) {
        Book book = Book.builder()
                .name(bookRequest.getName())
                .authorName(bookRequest.getAuthorName())
                .build();

        book.setDate(LocalDate.now());

        bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
