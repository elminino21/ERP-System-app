package com.gonzalez.security.formvalidator;

import java.lang.annotation.Annotation;

import javax.validation.Payload;

public class EmailValidator implements ValidEmail{

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String message() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<?>[] groups() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Class<? extends Payload>[] payload() {
		// TODO Auto-generated method stub
		return null;
	}

}
