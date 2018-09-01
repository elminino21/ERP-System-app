package com.gonzalez.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

	private String middleIni;
	@Column(length = 60)
	private String password;
	
	private boolean enabled;
	 
	private String email;

	private String function;
	
	private String department;
	
	private String secret;
	
	@ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "users_roles", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

	public User()
	{
		
	}

}
