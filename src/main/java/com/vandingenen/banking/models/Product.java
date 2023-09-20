package com.vandingenen.banking.models;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;

        private String code;

        @ManyToOne
        @JoinColumn(name = "id_cat")
        private Category category;

}
