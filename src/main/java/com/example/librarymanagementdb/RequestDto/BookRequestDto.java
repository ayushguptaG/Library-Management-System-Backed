package com.example.librarymanagementdb.RequestDto;

import com.example.librarymanagementdb.Enums.Genre;
import com.example.librarymanagementdb.Model.Author;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookRequestDto {

    private String name;
    private Genre genre;
    private int authorId;
}
