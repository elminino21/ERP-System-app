package com.gonzalez.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gonzalez.web.error.UserAlreadyExistException;

@ControllerAdvice
public class MainErrorHandler {

	@ExceptionHandler(UserAlreadyExistException.class)
	public String userAlreadyExistExceptionHandler()
	{
		return null;
	}
	
}
