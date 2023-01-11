package com.example.librarymanagementdb.Controller;

import com.example.librarymanagementdb.RequestDto.StudentRequestDto;
import com.example.librarymanagementdb.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;
    @PostMapping("/create")
    public String createStudent(@RequestBody()StudentRequestDto studentRequestDto){
        return studentService.createStudent(studentRequestDto);

    }
}
