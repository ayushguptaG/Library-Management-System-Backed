package com.example.librarymanagementdb.Service;

import com.example.librarymanagementdb.Converters.AuthorConverter;
import com.example.librarymanagementdb.Model.Author;
import com.example.librarymanagementdb.Repository.AuthorRepository;
import com.example.librarymanagementdb.RequestDto.AuthorRequestDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;

    public String createAuthor(AuthorRequestDto authorRequestDto){

        try {
            Author author = AuthorConverter.convertDtoToEntity(authorRequestDto);
            authorRepository.save(author);
        }
        catch (Exception e){
            log.info("createAuthor has caused an error");
            return "Create Author didn't work";
        }
        return "Author created successfully";
    }
}
