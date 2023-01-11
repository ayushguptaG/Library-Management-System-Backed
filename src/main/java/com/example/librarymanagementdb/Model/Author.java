package com.example.librarymanagementdb.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int age;
    private String country;
    private String email;

    //biDirectional mapping b/w (author-book)
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
    private List<Book> booksWritten;

}
