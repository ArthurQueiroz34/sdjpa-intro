package com.excalibur.sdjpaintro.bootstrap;

import com.excalibur.sdjpaintro.domain.Book;
import com.excalibur.sdjpaintro.repositories.BookRepository;

import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.deleteAll();

        Book bookDDD = new Book("Domain Driven Design", "123", "Random", null);
        Book savedDDD = bookRepository.save(bookDDD);

        Book bookSIA = new Book("Spring In Action", "456", "O'Reilly", null);
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Title: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
