package com.example.springsampleproject.repositories;

import com.example.springsampleproject.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
