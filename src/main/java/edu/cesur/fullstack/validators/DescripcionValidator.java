package edu.cesur.fullstack.validators;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Retention(RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = DescripcionValid.class)
public @interface DescripcionValidator {
	
	String message() default "Descripcion no valida." 
			+ " Debe contener al menos 5 palabras.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
