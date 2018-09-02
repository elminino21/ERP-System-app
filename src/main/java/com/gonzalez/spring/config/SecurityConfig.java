package com.gonzalez.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@ComponentScan(basePackages = { "com.gonzalez" })
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	
	
	
	
	
	
	  @Bean
	    @Override
	    public AuthenticationManager authenticationManagerBean() throws Exception 
	   {
	       
		  
		  return null;
	    }
	    
	    @Override
	    protected void configure(final AuthenticationManagerBuilder auth) throws Exception 
	    {
	       
	    }

	
	@Override
    public void configure(final WebSecurity web) throws Exception {
       // web.ignoring().antMatchers("/resources/**");
    }

	

    @Override
    protected void configure(final HttpSecurity http) throws Exception 
    {
       
        http.csrf().disable().authorizeRequests() .antMatchers("/login*","/login*", "/logout*", "/signin/**", "/signup/**", "/customLogin",
                "/user/registration*", "/registrationConfirm*", "/expiredAccount*", "/registration*",
                "/badUser*", "/user/resendRegistrationToken*" ,"/forgetPassword*", "/user/resetPassword*",
                 "/emailError*", "/resources/**",
                "/old/user/registration*","/successRegister*").antMatchers("/invalidSession*").anonymous()
        .antMatchers("/user/updatePassword*","/user/savePassword*","/updatePassword*").hasAuthority("CHANGE_PASSWORD_PRIVILEGE")
        .anyRequest().hasAuthority("READ_PRIVILEGE")
        .and()
        .formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/homepage.html")
        .failureUrl("/login?error=true")
        .successHandler(myAuthenticationSuccessHandler)
        .failureHandler(authenticationFailureHandler)
        .authenticationDetailsSource(authenticationDetailsSource)
    .permitAll()
        .and()
    .sessionManagement()
        .invalidSessionUrl("/invalidSession.html")
        .maximumSessions(1).sessionRegistry(sessionRegistry()).and()
        .sessionFixation().none()
    .and()
    .logout()
        .logoutSuccessHandler(myLogoutSuccessHandler)
        .invalidateHttpSession(false)
        .logoutSuccessUrl("/logout.html?logSucc=true")
        .deleteCookies("JSESSIONID")
        .permitAll()
     .and()
        .rememberMe().rememberMeServices(rememberMeServices()).key("theKey");
    	
    	
    	
    	
    }

}
