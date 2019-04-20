package com.example.demo.exception.handler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class BookControllerRuntimeExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler({RuntimeException.class})
	protected ResponseEntity<Object> handleRuntimeException(Exception ex, WebRequest wr)
	{
		return handleExceptionInternal(ex, "error message from "+ this.getClass().getName(), 
				new HttpHeaders(), HttpStatus.NOT_FOUND, wr);
	}
}
