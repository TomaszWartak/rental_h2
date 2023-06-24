package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String firstName;
    private String lastName;
    private String personalID;
    private String idCardNumber;
}
