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

        Book bookDDD = new Book("Domain Driven Design", "123", "Random");

        System.out.println("Id: " + bookDDD.getId());

        Book savedDDD = bookRepository.save(bookDDD);

        System.out.println("Id: " + savedDDD.getId());

        Book bookSIA = new Book("Spring In Action", "456", "O'Reilly");
        Book savedSIA = bookRepository.save(bookSIA);

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Title: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
