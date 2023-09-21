package com.vandingenen.banking.repositories;

import com.vandingenen.banking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    // SELECT * FROM User WHERE firstname = 'ali';
    // Recherche par firstname return list
    List<User> findAllByFirstname(String firstname);

    // SELECT * FROM User WHERE firstname LIKE 'ali';
    // Oublier la casse:
    List<User> findAllByFirstnameContaining(String firstname);

    // SELECT * FROM User WHERE firstname LIKE 'ali';
    // Oublier la casse:
    List<User> findAllByFirstnameContainingIgnoreCase(String firstname);

    // Jointure utilisateur compte pour sortir
    List<User> findAllByAccountIban(String iban);
}
