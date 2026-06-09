package com.ead.authuser.validations;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PasswordConstraintImpl.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface PasswordConstraint {
    String message() default """
            The password must contain at least one uppercase letter,
            one lowercase letter,
            one number, and one special character.
            It must be between 6 and 20 characters long.""";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
