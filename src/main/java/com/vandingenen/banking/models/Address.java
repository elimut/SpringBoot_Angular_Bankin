package com.vandingenen.banking.models;

import jakarta.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private Integer id;

    private String street;

    @OneToOne
    @JoinColumn(name = "id_student")
    private Student student;

}
