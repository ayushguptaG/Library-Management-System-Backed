package com.example.librarymanagementdb.Model;

import com.example.librarymanagementdb.Model.Author;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.example.librarymanagementdb.Enums.Genre;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity   //create the same in schema
@Table    //table name in schema if provided
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Id  //setting this parameter as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(value= EnumType.STRING)  //store this as string in db but in code it will be enum
    private Genre genre;

    @ManyToOne
    @JoinColumn
    private Author author;  //foreign key

    @ManyToOne
    @JoinColumn
    private Card card;

}

