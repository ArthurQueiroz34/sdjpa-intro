package com.excalibur.sdjpaintro.repositories;

import com.excalibur.sdjpaintro.domain.composite.AuthorEmbedded;
import com.excalibur.sdjpaintro.domain.composite.NameId;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 8/18/21.
 */
public interface AuthorEmbeddedRepository extends JpaRepository<AuthorEmbedded, NameId> {
}