package com.example.librarymanagementdb.RequestDto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorRequestDto {

    private String name;
    @Column(nullable = false, unique = true)
    private String email;
    private int age;
    private String country;

}
