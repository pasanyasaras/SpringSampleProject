package com.example.springsampleproject.repositories;

import com.example.springsampleproject.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
