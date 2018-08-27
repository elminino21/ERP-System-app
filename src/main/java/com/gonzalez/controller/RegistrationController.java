package com.gonzalez.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.gonzalez.dto.UserDto;

@Controller
public class RegistrationController {

	@RequestMapping(value="/registration", method = RequestMethod.GET)
	public String showRegistrationForm( Model model)
	{
		UserDto user = new UserDto();
		model.addAttribute("user", user);
		
		return "registration";
	}
	
	
	
	
	
		@PostMapping("/registration")
	   public String confirmRegistration(final HttpServletRequest request, final Model model, @ModelAttribute("user") UserDto newUser) {
	        final Locale locale = request.getLocale();
	        locale.getCountry();
	       
	        
	        return null;
	    }

}
