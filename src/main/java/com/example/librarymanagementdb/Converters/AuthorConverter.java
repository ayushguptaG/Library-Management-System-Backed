package com.example.librarymanagementdb.Converters;

import com.example.librarymanagementdb.Model.Author;
import com.example.librarymanagementdb.RequestDto.AuthorRequestDto;

public class AuthorConverter {

    public static Author convertDtoToEntity(AuthorRequestDto authorRequestDto){

        Author author= Author.builder().name(authorRequestDto.getName()).age(authorRequestDto.getAge())
                       .email(authorRequestDto.getEmail())
                       .country(authorRequestDto.getCountry()).build();

        return author;
    }
}
