package edu.cesur.fullstack.validators;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DescripcionValid implements ConstraintValidator<DescripcionValidator, String> {

	
	public void initialize(DescripcionValidator constraintAnnotation) {
	}
	
	
	@Override
	public boolean isValid(String valor, ConstraintValidatorContext context) {
		if (valor == null || valor.trim().isEmpty()) {
			log.info("Descripción null");
			return false;

			}

			String[] palabras = valor.trim().split("\\s+");

			return palabras.length >= 5;
		
	}

}
