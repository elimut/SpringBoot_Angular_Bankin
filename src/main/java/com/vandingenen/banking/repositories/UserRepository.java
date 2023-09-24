package com.vandingenen.banking.repositories;

import com.vandingenen.banking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    // SELECT * FROM _user WHERE firstname = 'ali';
    // Recherche par firstname return list
    List<User> findAllByFirstname(String firstname);

    // SELECT * FROM _user WHERE firstname LIKE '%ali%';
    // Oublier la casse:
    List<User> findAllByFirstnameContaining(String firstname);

    // SELECT * FROM _user WHERE firstname LIKE 'ali';
    // Oublier la casse:
    List<User> findAllByFirstnameContainingIgnoreCase(String firstname);

    // Jointure utilisateur compte
    //SELECT * FROM _user u INNER JOIN account a ON u.id = a.id_user and a.iban = 'iban';
    List<User> findAllByAccountIban(String iban);

    // SELECT * From _user WHERE firstname = '%%' AND email = '';
    User findByFirstnameContainingIgnoreCaseAndEmail(String firstname, String email);

    @Query("from User where firstname = :fn")
    List<User> searchByFirstname(@Param("fn") String firstname);

    @Query("from User where firstname = '%:firstname%'")
    List<User> searchByFirstnameContaining(String firstname);

    @Query("from User u inner join Account a on u.id = a.user.id where a.iban = :iban")
    List<User> searchByIban(String iban);

    @Query("select * from _user u inner join account a on u.id = a.user_id where a.iban = :iban, nativeQuery = true")
    List<User> searchByIbanNative(String iban);

}
