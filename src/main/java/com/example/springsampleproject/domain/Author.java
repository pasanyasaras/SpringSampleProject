package com.example.springsampleproject.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> book;

    public Author() {
    }

    public Author(String firstName, String lastName, Set<Book> book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.book = book;
    }
}
