package com.example.tournament.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ApiExceptionHandler {

	@ExceptionHandler(value = {ApiRequestException.class})
	public ResponseEntity<Object> handleApiRequestException(ApiRequestException e) {
		HttpStatus unauthorized = HttpStatus.UNAUTHORIZED;
		ApiException apiException = new ApiException(
			e.getMessage(),
			unauthorized
		);

		return new ResponseEntity<>(apiException, unauthorized);
	}
}
