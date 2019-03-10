package com.techelevator.validation.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.validation.model.Login;
import com.techelevator.validation.model.Registration;

@Controller
public class UserController {
	// GET: /
	@RequestMapping(path= {"/","/login"}, method=RequestMethod.GET)
	public String getMainScreen(ModelMap map) {
		
		if(!map.containsAttribute("login")) {
			map.addAttribute("login", new Login());
		}
		
		return "login";
	}
	
	@RequestMapping(path="/login", method=RequestMethod.POST)
	public String handleLogin(@Valid @ModelAttribute("login") Login login, BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "login";
		}
		else if(login.getEmail().equals("anishniroula1@gmail.com") && login.getPassword().equals("anish")) {
			attr.addFlashAttribute("login", login);
			
			return "redirect:/confirmation";
		}
		return "login";
		
		
	}
	
	@RequestMapping(path="/confirmation",method=RequestMethod.GET)
	public String showConfirmation(ModelMap map) {
		if(!map.containsAttribute("login")) {
			map.addAttribute("login", new Login());
		}
		return "confirmation";
		
	}

	@RequestMapping(path="/registration", method=RequestMethod.GET)
	public String getRegistration(ModelMap map) {
		
		if(!map.containsAttribute("registration")) {
			map.addAttribute("registration", new Registration());
		}
		
		return "registration";
	}
	
	@RequestMapping(path="/registration", method=RequestMethod.POST)
	public String handleLogin(@Valid @ModelAttribute("registration") Registration registration, BindingResult result, RedirectAttributes attr) {
		
		if(result.hasErrors()) {
			return "registration";
		}
		
			attr.addFlashAttribute("registration", registration);
			
			return "redirect:/registrationConfirmation";
		
		
	}
	
	@RequestMapping(path="/registrationConfirmation",method=RequestMethod.GET)
	public String showRegistrationConfirmation(ModelMap map) {
		if(!map.containsAttribute("registration")) {
			map.addAttribute("registration", new Registration());
		}
		return "registrationConfirmation";
		
	}
	
}
