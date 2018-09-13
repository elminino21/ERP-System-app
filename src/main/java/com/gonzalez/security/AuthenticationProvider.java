package com.gonzalez.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

import com.gonzalez.entities.User;
import com.gonzalez.repository.UserRepository;

public class AuthenticationProvider extends DaoAuthenticationProvider{
	
	@Autowired
	private UserRepository userRepo;
	
	
	public Authentication authenticaticate(Authentication auth) throws AuthenticationException
	{
		final User user = userRepo.findByEmail(auth.getName());
		if(user == null)
		{
			throw new BadCredentialsException("invalid email or password");
		}
		
		final Authentication result = super.authenticate(auth);
		
		return new UsernamePasswordAuthenticationToken(user, result.getCredentials(), result.getAuthorities());
	}
	
	@Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

}
