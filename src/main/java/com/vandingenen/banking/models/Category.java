package com.vandingenen.banking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Category {

    @Id
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
