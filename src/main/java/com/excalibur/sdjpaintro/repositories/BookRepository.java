package com.excalibur.sdjpaintro.repositories;

import com.excalibur.sdjpaintro.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
