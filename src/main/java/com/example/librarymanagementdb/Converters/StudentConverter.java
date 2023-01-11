package com.example.librarymanagementdb.Converters;

import com.example.librarymanagementdb.Model.Student;
import com.example.librarymanagementdb.RequestDto.StudentRequestDto;

public class StudentConverter {

    public static Student convertDtoToEntity(StudentRequestDto studentRequestDto){

        Student student= Student.builder().name(studentRequestDto.getName()).age(studentRequestDto.getAge())
                        .email(studentRequestDto.getEmail()).country(studentRequestDto.getCountry()).build();

        return student;
    }
}
