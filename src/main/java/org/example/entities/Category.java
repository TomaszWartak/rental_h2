package org.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    private String name;
    private String description;

    public Category() {
    }
}
