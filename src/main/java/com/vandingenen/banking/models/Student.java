package com.vandingenen.banking.models;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Integer id;

    private String firstname;

    private String lastname;

    @OneToOne(mappedBy = "student")
    private Address address;

}
