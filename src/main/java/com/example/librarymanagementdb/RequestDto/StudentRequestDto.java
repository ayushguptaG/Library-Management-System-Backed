package com.example.librarymanagementdb.RequestDto;

import com.example.librarymanagementdb.Model.Student;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentRequestDto {

    @Column(nullable = false)
    private String name;
    private int age;
    @Column(unique = true, nullable = false)
    private String email;
    private String country;




}
