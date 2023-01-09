package com.example.librarymanagementdb.Service;

import com.example.librarymanagementdb.Controller.BookController;
import com.example.librarymanagementdb.Converters.BookConverter;
import com.example.librarymanagementdb.Model.Author;
import com.example.librarymanagementdb.Model.Book;
import com.example.librarymanagementdb.Repository.AuthorRepository;
import com.example.librarymanagementdb.Repository.BookRepository;
import com.example.librarymanagementdb.RequestDto.BookRequestDto;
import com.example.librarymanagementdb.UpdateBookPages;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@Slf4j
public class BookService {

    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    public String createBook(BookRequestDto bookRequestDto) {

        Book book = BookConverter.convertDtoToEntity(bookRequestDto);

        int authorId= bookRequestDto.getAuthorId();
        Author author;
        try{
             author= authorRepository.findById(authorId).get();
        }
        catch(NoSuchElementException e){
            log.info("createBook has caused an error");
            return "Author doesn't exist";
        }

        book.setAuthor(author);
        List<Book> listOfBooks= author.getBooksWritten();
        listOfBooks.add(book);
        author.setBooksWritten(listOfBooks);

        return "Book added successfully";
    }
    public Book findBook(int id) throws Exception{

        Book book= bookRepository.findById(id).get();

        return book;
    }
}
