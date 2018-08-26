package com.gonzalez.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.Data;
/**
 * classe is use to optain data from the model and transfer it to the a user class.
 * @author elminino
 *
 */
@Data
public class UserDto {
	
	@NotNull
	@NotEmpty
	@Size(min = 5)
	private String userID;
	@NotNull
	@NotEmpty
	private String firstName;
	@NotNull
	@NotEmpty
	private String lastName;
	@NotNull
	@NotEmpty
	private char middleIni;
	@NotNull
	@NotEmpty
	@Size(min = 6)
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
	@NotNull
	@NotEmpty
	private String secret;

	
	
	

}
