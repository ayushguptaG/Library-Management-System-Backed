package com.example.librarymanagementdb.Model;

import com.example.librarymanagementdb.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    @OneToOne
    @JoinColumn
    private Student student;

    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    private List<Book> booksIssued;

}
