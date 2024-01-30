package com.excalibur.sdjpaintro.repositories;

import com.excalibur.sdjpaintro.domain.composite.AuthorComposite;
import com.excalibur.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorCompositeRepository extends JpaRepository<AuthorComposite, NameId> {
}