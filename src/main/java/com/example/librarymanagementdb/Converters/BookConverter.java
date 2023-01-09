package com.example.librarymanagementdb.Converters;

import com.example.librarymanagementdb.Model.Book;
import com.example.librarymanagementdb.RequestDto.BookRequestDto;

public class BookConverter {

    public static Book convertDtoToEntity(BookRequestDto bookRequestDto){

        Book book= Book.builder().name(bookRequestDto.getName()).genre(bookRequestDto.getGenre()).build();

        return book;
    }
}
