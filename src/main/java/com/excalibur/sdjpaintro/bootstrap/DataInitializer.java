package com.excalibur.sdjpaintro.bootstrap;

import com.excalibur.sdjpaintro.domain.AuthorUuid;
import com.excalibur.sdjpaintro.domain.Book;
import com.excalibur.sdjpaintro.repositories.AuthorUuidRepository;
import com.excalibur.sdjpaintro.repositories.BookRepository;

import org.springframework.boot.CommandLineRunner;

public class DataInitializer implements CommandLineRunner {

    private final BookRepository bookRepository;
    private final AuthorUuidRepository authorUuidRepository;

    public DataInitializer(BookRepository bookRepository, AuthorUuidRepository authorUuidRepository) {
        this.bookRepository = bookRepository;
        this.authorUuidRepository = authorUuidRepository;
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

        AuthorUuid authorUuid = new AuthorUuid();
        authorUuid.setFirstName("Alexia");
        authorUuid.setLastName("Straza");
        AuthorUuid savedAuthor = authorUuidRepository.save(authorUuid);
        System.out.println("Saved Author UUID: " + savedAuthor.getId());
    }
}
