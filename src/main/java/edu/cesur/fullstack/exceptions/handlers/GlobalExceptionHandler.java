package edu.cesur.fullstack.exceptions.handlers;

import java.net.URI;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import edu.cesur.fullstack.exceptions.ArtworkCreationException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ArtworkCreationException.class )
	public ProblemDetail handleBookNotFoundException(ArtworkCreationException e) {

		ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(HttpStatus.BAD_REQUEST, e.getMessage());
		problemDetail.setTitle("Artwork Exception Occurred");
		problemDetail.setType(URI.create("http://cesurformacion.com"));
		problemDetail.setProperty("errorCategory", "Artwork");
		problemDetail.setProperty("timeStamp", Instant.now());

		return problemDetail;
	}
	
	
}
