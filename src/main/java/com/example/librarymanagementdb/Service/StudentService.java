package com.example.librarymanagementdb.Service;

import com.example.librarymanagementdb.Converters.StudentConverter;
import com.example.librarymanagementdb.Enums.CardStatus;
import com.example.librarymanagementdb.Model.Card;
import com.example.librarymanagementdb.Model.Student;
import com.example.librarymanagementdb.Repository.StudentRepository;
import com.example.librarymanagementdb.RequestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public String createStudent(StudentRequestDto studentRequestDto){

        Student student= StudentConverter.convertDtoToEntity(studentRequestDto);

        Card newCard= new Card();
        newCard.setCardStatus(CardStatus.ACTIVATED);
        newCard.setStudent(student);  //unidirectional mapping (foreign key column)

        student.setCard(newCard);   //bidirectional mapping
        studentRepository.save(student);

        //cardRepository.save() will automatically be done by cascading

        return "Student added successfully";
    }
}
