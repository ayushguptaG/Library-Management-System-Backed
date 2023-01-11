package com.example.librarymanagementdb.Service;

import com.example.librarymanagementdb.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;
}
