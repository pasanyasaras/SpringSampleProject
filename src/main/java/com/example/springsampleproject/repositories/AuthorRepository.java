package com.example.springsampleproject.repositories;

import com.example.springsampleproject.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
