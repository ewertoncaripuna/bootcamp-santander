package me.dio.web.livraria.controller;

import me.dio.web.livraria.model.Book;
import me.dio.web.livraria.service.DataConverter;
import me.dio.web.livraria.repository.BookRepository;
import me.dio.web.livraria.service.APIConsumer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    private final BookRepository bookRepository;
    private final me.dio.web.livraria.service.APIConsumer apiConsumer;
    private final DataConverter dataConverter;

    public BookController(BookRepository bookRepository, APIConsumer apiConsumer, DataConverter dataConverter) {
        this.bookRepository = bookRepository;
        this.apiConsumer = apiConsumer;
        this.dataConverter = dataConverter;
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book savedBook = bookRepository.save(book);
        return ResponseEntity.ok(savedBook);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        return bookRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/title")
    public ResponseEntity<Book> getBookByTitle(@RequestParam String title) {
        return bookRepository.findByTitleContainsIgnoreCase(title)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/language")
    public ResponseEntity<List<Book>> getBooksByLanguage(@RequestParam String language) {
        List<Book> books = bookRepository.findBooksByLanguage(language);
        return ResponseEntity.ok(books);
    }

    @GetMapping("/top10")
    public ResponseEntity<List<Book>> getTop10BooksByDownloads() {
        List<Book> books = bookRepository.findTop10ByOrderByNumberDownloadsDesc();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/author")
    public ResponseEntity<List<Book>> getBooksByAuthorName(@RequestParam String authorName) {
        List<Book> books = bookRepository.findBooksByAuthorName(authorName);
        return ResponseEntity.ok(books);
    }
}