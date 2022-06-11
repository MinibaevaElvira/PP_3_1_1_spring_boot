package com.example.springBoot.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Component
@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    @NotEmpty(message = "Name should not be empty")
    @Size(min=2, max=30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Column(name="surname")
    @NotEmpty
    @Size(min = 2, max=40, message = "Surname should be between 2 and 40 characters")
    private String surname;

    @Column(name="age")
    @Min(value = 1, message = "Age should be greater than 0")
    private int age;
}
