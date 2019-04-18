package com.techelevator;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.techelevator.logininfo.ForgotPassword;
import com.techelevator.logininfo.User;
import com.techelevator.logininfo.UserDAO;
import com.techelevator.workout.Workout;
import com.techelevator.workout.WorkoutDAO;

@Controller
@SessionAttributes("loginuser")
public class HomePageController {
	@Autowired
	private UserDAO userDao;

	@Autowired
	private WorkoutDAO workoutDao;

	/*
	 * Main Home Page,Where user can login and start the journey
	 */
	@RequestMapping(path = { "/homepage", "/" }, method = RequestMethod.GET)
	public String displayHomePage(ModelMap map, User user) {
	
		if (!map.containsAttribute("userSignUp")) {
			map.addAttribute("userSignUp", new User());
		}
		return "homepage";
	}
	
	/*
	 * Display login page
	 */
	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String displayLoginPage(ModelMap map,HttpSession session) {
		if (map.get("loginuser")!=null) {
			return "redirect:/";
		}
		return "login";
	}

	/*
	 * Where the login post happen by checking the correct username and Password from users
	 * and also start the session
	 * and also create a login log after user logged in database
	 */
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String loginHandle(User user, @RequestParam String userName, @RequestParam String password, ModelMap map,HttpSession session) {

		if (!(userDao.isUsernameAndPasswordValid(userName, userName, password))) {
			map.addAttribute("error", "Invalid username or password");
			user = null;
			return "login";
		}
		
		map.addAttribute("loginuser", user);
		LocalDateTime a = LocalDateTime.now();
		user.setDateTime(a);
		userDao.createLoginRecord(user);
			return "redirect:/complete";

		}

	/*
	 * Shows the signup page, this is the bean class that't why there is map.containsattribute added
	 */
	@RequestMapping(path = "/signup", method = RequestMethod.GET)
	public String displaySignUp(ModelMap map,HttpSession session) {
		if (map.get("loginuser")!=null) {
			return "redirect:/";
		}

		if (!map.containsAttribute("userSignUp")) {
			map.addAttribute("userSignUp", new User());
		}
		return "signup";

	}

	/*
	 * This page will check the username (unique) and email (unique) from data if any record match
	 * and complete the signup if there is no error. Must fill all the form.
	 */
	@RequestMapping(path = "/signup", method = RequestMethod.POST)
	public String displayHomepage(@Valid @ModelAttribute("userSignUp") User user, BindingResult result,
			@RequestParam String userName, @RequestParam String email) {
		try {

			if (result.hasErrors()) {
				return "signup";
			}

			if (userDao.findUserByEmail(email).getEmail().equals(email)) {
				result.rejectValue("email", "error.email", "Email Already Exist");
				return "signup";
			}

		} catch (NullPointerException e) {
			try {
				if (userDao.findUserByUsername(userName).getUserName().equals(userName)) {
					result.rejectValue("userName", "error.userName", "Username Already Exist");
					return "signup";
				}
			} catch (NullPointerException f) {
				userDao.createUser(user);
			}
		}

		return "redirect:/complete";
	}


	/*
	 * No sure yet
	 */
	@RequestMapping(path = "/main", method = RequestMethod.GET)
	public String displayMainPage(ModelMap map) {

		return "main";

	}

	/*
	 * this is Test Redirect
	 */
	@RequestMapping(path = "/complete", method = RequestMethod.GET)
	public String displayCompleted(ModelMap map,HttpSession session) {
		if (map.get("loginuser") == null) {
			return "redirect:/login";
		}		
		
		 User user = (User) map.get("loginuser");
		return "complete";

	}

	/*
	 * This will end the session and logout the user after they submit the logout link
	 */
	@RequestMapping(path = "/logout", method = RequestMethod.POST)
	public String logout(ModelMap map, HttpSession session, HttpServletRequest request, HttpServletResponse response, SessionStatus status)
			throws ServletException, IOException {
		
		
		session.removeAttribute("loginuser");
		session.invalidate();
		status.setComplete();
		
		response.setHeader("Cache-Control", "no-cache"); // Forces caches to obtain a new copy of the page from the
															// origin server
		response.setHeader("Cache-Control", "no-store"); // Directs caches not to store the page under any circumstance
		response.setDateHeader("Expires", 0); // Causes the proxy cache to see the page as "stale"
		response.setHeader("Pragma", "no-cache"); // HTTP 1.0 backward compatibility

		return "redirect:/";
	}
	

}
