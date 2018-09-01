package com.gonzalez.web.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="Evalid password entered")
public class InvalidPasswordException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1150991435805176857L;

}
