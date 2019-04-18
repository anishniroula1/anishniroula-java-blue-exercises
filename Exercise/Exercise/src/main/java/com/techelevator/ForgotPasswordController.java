package com.techelevator;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.logininfo.ForgotPassword;
import com.techelevator.logininfo.ForgotPasswordDAO;

@Controller
@SessionAttributes("loginuser")
public class ForgotPasswordController {

	@Autowired
	private ForgotPasswordDAO forgotPasswordDao;
	
	@RequestMapping(path="/forgotpassword", method=RequestMethod.GET)
	public String showForgotPasswodpage(ModelMap map) {
		if (map.get("loginuser")!=null) {
			return "redirect:/";
		}
		
		if (!map.containsAttribute("forgot")) {
			map.addAttribute("forgot", new ForgotPassword());
		}
		return "forgotpassword";
	}
	
	@RequestMapping(path="/forgotpassword", method=RequestMethod.POST)
	public String updateForgotPassword(@Valid @ModelAttribute("forgot") ForgotPassword user, BindingResult result,
			@RequestParam String userName, @RequestParam String password) {
		try {
			if(result.hasErrors()) {
				return "forgotpassword";
			}

			if ((forgotPasswordDao.findUserByUsername(userName).getUserName().equals(userName))) {
				forgotPasswordDao.updatePaswordByUserName(password,userName);
				return "redirect:/";
			}
		}
				catch(NullPointerException e) {
					result.rejectValue("userName", "error.userName", "Username didn't match our record");
			
			return "forgotpassword";
					
				}
		return "forgotpassword";
	}
}
