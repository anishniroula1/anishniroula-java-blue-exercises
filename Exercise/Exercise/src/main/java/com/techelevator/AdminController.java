package com.techelevator;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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

import com.techelevator.logininfo.User;
import com.techelevator.logininfo.UserDAO;
import com.techelevator.workout.Workout;
import com.techelevator.workout.WorkoutDAO;
import com.techelevator.workout.WorkoutInstruction;
import com.techelevator.workout.WorkoutInstructionDAO;

@Controller
@SessionAttributes("loginuser")
public class AdminController {

	@Autowired
	private WorkoutDAO workoutDao;

	@Autowired
	private WorkoutInstructionDAO workoutInstructionDao;
	
	@Autowired
	private UserDAO userDao;

	/*
	 * In this page, Admin user view the workout ad Post.
	 */
	@RequestMapping(path = "/admin/adminpost", method = RequestMethod.GET)
	public String displayAdminWorkoutPost(ModelMap map, HttpSession session, HttpServletResponse response) {
		
			if (map.get("loginuser") == null) {
				return "redirect:/login";
			}

//		User user = (User) session.getAttribute("loginuser");
//		User user = (User) map.get("loginuser");

		if(!(userDao.findUserRoleByUserName((User) session.getAttribute("loginuser")).getUserRole().equals("ADMIN"))) {
			return "redirect:/403error";
		}
//			if (!((User) map.get("loginuser")).getUserRole().equals("ADMIN")) {
//				return "redirect:/403error";
//			}
		
		if (!map.containsAttribute("workoutPost")) {
			map.addAttribute("workoutPost", new Workout());
		}

		return "admin/adminpost";
	}

	/*
	 * This is post redirect for delete the workout from database
	 */
	@RequestMapping(path = "/admin/allpost", method = RequestMethod.POST)
	public String DeleteWorkout(@RequestParam String code, ModelMap map) {

		workoutDao.deleteByWorkoutCode(code);

		return "redirect:/admin/allpost";
	}

	/*
	 * This page shows the form with value of worout where you can edit, but this is
	 * connecting through workout Unique code
	 */
	@RequestMapping(path = "/admin/editworkout", method = RequestMethod.GET)
	public String displayEditWorkout(ModelMap map, @RequestParam String code) {
		
		if (map.get("loginuser") == null) {
			return "redirect:/login";
		}
			
			
			if (!map.containsAttribute("workoutPost")) {
				map.addAttribute("workoutPost", new Workout());
			}
			
		map.addAttribute("workout", workoutDao.displayWorkoutByCode(code));

		List<WorkoutInstruction> workoutInstruction = workoutInstructionDao.getInstructionByCode(code);
		map.addAttribute("instructions", workoutInstruction);


		return "admin/editworkout";
	}

	/*
	 * This post method will edit and update the workout in both database and
	 * website
	 */
	@RequestMapping(path = "/admin/editworkout", method = RequestMethod.POST)
	public String updateWorkout(@Valid @ModelAttribute("workoutPost") Workout workout, BindingResult result,
			@RequestParam String code, ModelMap map) {

		if (result.hasErrors()) {
			return "admin/editworkout" + code;
		}
		workoutDao.updateWorkout(workout, code);

		return "redirect:/admin/allpost";
	}

	/*
	 * This page shows all the workout list, not everyone can view this yet; only
	 * Admin user
	 */
	@RequestMapping(path = "/admin/allpost", method = RequestMethod.GET)
	public String displayAllWorkout(ModelMap map, HttpServletResponse response) {
		if (map.get("loginuser") == null) {
			return "redirect:/login";
		}
		List<Workout> workout = workoutDao.displayWorkout();
		map.addAttribute("wokoutList", workout);

		return "admin/allpost";
	}

	/*
	 * In this page, Admin user post the new workout details.
	 */
	@RequestMapping(path = "/admin/adminpost", method = RequestMethod.POST)
	public String postWorkoutForm(@Valid @ModelAttribute("workoutPost") Workout workout, BindingResult result,
			@RequestParam String workoutName, @RequestParam String bodyLocation, ModelMap map) {

		try {
			if (result.hasErrors()) {

				return "admin/adminpost";
			}
			String code = workoutName + " " + bodyLocation;

			if (workoutDao.displayWorkoutByCode(code).getCode().equals(code)) {
				result.rejectValue("workoutName", "error.workoutName", "This Workout Already Exist");
				return "admin/adminpost";
			}
		} catch (NullPointerException e) {
			workoutDao.saveWorkout(workout);
		}
		return "redirect:/complete";

	}

	/*
	 * 403 User don't have Access
	 */
	@RequestMapping(path = "/403error", method = RequestMethod.GET)
	public String display403ErrorPage() {
		return "admin/403error";
	}
	
	
}
