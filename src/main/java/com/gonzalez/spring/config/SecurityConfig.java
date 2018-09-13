package com.gonzalez.spring.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.RememberMeServices;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.rememberme.InMemoryTokenRepositoryImpl;

import com.gonzalez.repository.UserRepository;
import com.gonzalez.security.AuthenticationProvider;

@Configuration
@ComponentScan(basePackages = { "com.gonzalez" })
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	
	 	@Autowired
	    private UserDetailsService userDetailsService;

	    @Autowired
	    private AuthenticationSuccessHandler myAuthenticationSuccessHandler;

	    @Autowired
	    private AuthenticationFailureHandler authenticationFailureHandler;

	    @Autowired
	    private UserRepository userRepository;

	    public SecurityConfig() {
	        super();
	    }

	    
	    @Bean
	    @Override
	    public AuthenticationManager authenticationManagerBean() throws Exception {
	        return super.authenticationManagerBean();
	    }
	    
	    @Override
	    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
	        auth.authenticationProvider(authProvider());
	    }

	    @Override
	    public void configure(final WebSecurity web) throws Exception {
	        web.ignoring().antMatchers("/resources/**");
	    }

	    @Override
	    protected void configure(final HttpSecurity http) throws Exception {
	        // @formatter:off
	        http
	            .csrf().disable()
	            .authorizeRequests()
	                .antMatchers("/login*","/login*", "/logout*", "/signin/**", "/signup/**", "/customLogin"
	                       ).permitAll()
	                .antMatchers("/invalidSession*").anonymous()
	                .antMatchers("/user/updatePassword*","/user/savePassword*","/updatePassword*").hasAuthority("CHANGE_PASSWORD_PRIVILEGE")
	                .anyRequest().hasAuthority("READ_PRIVILEGE")
	                .and()
	            .formLogin()
	                .loginPage("/login")
	                .defaultSuccessUrl("/index.html")
	                .failureUrl("/login?error=true")
	                .successHandler(myAuthenticationSuccessHandler)
	                .failureHandler(authenticationFailureHandler)
	            .permitAll();
	         
	    }

	   
	  
	    
	    @Bean
	    public DaoAuthenticationProvider authProvider() {
	        final AuthenticationProvider authProvider = new AuthenticationProvider();
	        authProvider.setUserDetailsService(userDetailsService);
	        authProvider.setPasswordEncoder(encoder());
	        return authProvider;
	    }
	 

	    @Bean
	    public PasswordEncoder encoder() {
	        return new BCryptPasswordEncoder(11);
	    }

	    @Bean
	    public SessionRegistry sessionRegistry() {
	        return new SessionRegistryImpl();
	    }

	  
	
	
}
