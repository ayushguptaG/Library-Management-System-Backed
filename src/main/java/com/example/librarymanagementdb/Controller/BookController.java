package com.example.librarymanagementdb.Controller;

import com.example.librarymanagementdb.RequestDto.BookRequestDto;
import com.example.librarymanagementdb.Service.BookService;
import com.example.librarymanagementdb.Model.Book;
import com.example.librarymanagementdb.UpdateBookPages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("/create")
    public String createBook(@RequestBody() BookRequestDto bookRequestDto){

        return bookService.createBook(bookRequestDto);
    }

}
