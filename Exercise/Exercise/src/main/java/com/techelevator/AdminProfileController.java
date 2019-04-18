package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminProfileController {

	/*
	 * This is user profile dashboard throgh admin side
	 */
	@RequestMapping(path="/admin/profile", method=RequestMethod.GET)
	public String displayProfilePage(ModelMap map) {
		return "admin/profile";
	}
	
	@RequestMapping(path="/admin/practice", method=RequestMethod.GET)
	public String practice() {
		return "admin/practice";
	}
	
}
