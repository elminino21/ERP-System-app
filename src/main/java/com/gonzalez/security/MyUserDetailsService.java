package com.gonzalez.security;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gonzalez.entities.Privilege;
import com.gonzalez.entities.Role;
import com.gonzalez.entities.User;
import com.gonzalez.repository.UserRepository;
@Service("userDetailsService")
@Transactional
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	private LoginAttemptService loginAttemptService;
	
	
	@Autowired
	private HttpServletRequest request;
	
	@Autowired
	private UserRepository userRepository;
	
	public MyUserDetailsService()
	{
		super();
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		final String ip = getClientIP();
		if(loginAttemptService.isBlocked(ip))
		{
			
		}
		 if (loginAttemptService.isBlocked(ip)) {
	            throw new RuntimeException("blocked");
	        }

		
		try {
			final User user = userRepository.findByEmail(username);
			
			if(user == null)
			{
				throw new UsernameNotFoundException("User not found with the credentials" + username);
			}
			
			return new org.springframework.security.core.userdetails.User(user.getEmail(), 
					user.getPassword(), user.isEnabled(), true, true, true, getAuthorities(user.getRoles()));
			
		}	catch(final Exception e)
		{
			throw new RuntimeException(e);
		}
	}
	
	
	private final List<String> getPrivileges(final Collection<Role> roles) {
        final List<String> privileges = new ArrayList<String>();
        final List<Privilege> collection = new ArrayList<Privilege>();
        for (final Role role : roles) {
            collection.addAll(role.getPrivileges());
        }
        for (final Privilege item : collection) {
            privileges.add(item.getName());
        }

        return privileges;
    }
	
	 private final Collection<? extends GrantedAuthority> getAuthorities(final Collection<Role> roles) {
	        return getGrantedAuthorities(getPrivileges(roles));
	    }
	 
	private final String getClientIP() {
		final String xfHeader = request.getHeader("X-Forwarded-For");
		
		if(xfHeader == null)
		{
			return request.getRemoteAddr();
		}
		return xfHeader.split(",")[0];
	}
	
	
	
	private final List<GrantedAuthority> getGrantedAuthorities(final List<String> privileges) {
        final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (final String privilege : privileges) {
            authorities.add(new SimpleGrantedAuthority(privilege));
        }
        return authorities;
    }

}
