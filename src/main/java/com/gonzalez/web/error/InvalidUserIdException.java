package com.gonzalez.web.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason="user not found")
public class InvalidUserIdException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7834053838087757259L;

}
