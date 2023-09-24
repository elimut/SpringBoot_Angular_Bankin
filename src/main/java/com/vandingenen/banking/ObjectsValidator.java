package com.vandingenen.banking;

import jakarta.persistence.Column;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class ObjectsValidator<T> {

    // Pour fournir en validation, construit objet validator
    private final ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

    // Récupèrer le validator pour valider les objets
    private final Validator validator = factory.getValidator();

    public void validate(T objectToValidate) {
        //Appel à la méthode validate qui renvoie un set de contrainte de violation
        Set<ConstraintViolation<T>> violations = validator.validate(objectToValidate);
        // Si violation l'on ne récupère que les messages
        if (!violations.isEmpty()) {
            Set<String> errorMessages = violations.stream()
                    .map(ConstraintViolation::getMessage)
                    .collect(Collectors.toSet());
            // levée d'erreur, informer API: todo raise an exception
        }
    }

}
