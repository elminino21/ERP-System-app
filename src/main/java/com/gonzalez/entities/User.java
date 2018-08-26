package com.gonzalez.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;
@Data
@Entity
@Table(name = "user_account")
public class User {
	
	
	@Column(unique = true, nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
	private Long id;
	private String firstName;
	
	private String lastName;

	private char middleIni;
	@Column(length = 60)
	private String password;
	
	private boolean enabled;
	 
	private String email;

	private String function;
	
	private String department;
	
	private String secret;

}
