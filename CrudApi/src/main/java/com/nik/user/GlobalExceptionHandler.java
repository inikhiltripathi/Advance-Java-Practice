package com.nik.user;

import java.util.HashMap;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Object> handleValidationException(MethodArgumentNotValidException ex) {

		HashMap<String, String> storeErrors = new HashMap<>();

		BindingResult bindingResult = ex.getBindingResult();
		//System.out.println(bindingResult.toString());
		
		List<FieldError> fieldErrorsList = bindingResult.getFieldErrors();
		//System.out.println(fieldErrorsList);

		for (FieldError fieldError : fieldErrorsList) {

			String fieldName = fieldError.getField();
			String fieldMsg = fieldError.getDefaultMessage();

			storeErrors.put(fieldName, fieldMsg);

		}
		return new ResponseEntity<Object>(storeErrors, HttpStatus.BAD_REQUEST);
		// return ResponseEntity.badRequest().body(storeErrors);

	}

}
