package com.gonzalez.entities;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
@Entity
public class User {
	
	@NotNull
	@NotEmpty
	private String firstName;
	@NotNull
	@NotEmpty
	private String lastName;
	@NotNull
	@NotEmpty
	private char MI;
	@NotNull
	@NotEmpty
	private String password;
	@NotNull
	@NotEmpty
	private String matchingPassword;
	@NotNull
	@NotEmpty
	private String email;
	@NotNull
	@NotEmpty
	private String matchingEmail;
	@NotNull
	@NotEmpty
	private String function;
	@NotNull
	@NotEmpty
	private String department;
	
	

}
