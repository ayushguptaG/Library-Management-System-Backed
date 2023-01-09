package com.example.librarymanagementdb.Repository;

import com.example.librarymanagementdb.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
