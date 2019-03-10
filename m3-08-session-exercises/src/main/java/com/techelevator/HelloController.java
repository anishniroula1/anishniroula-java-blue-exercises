package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller 
@SessionAttributes("favThings")
public class HelloController {

	@RequestMapping(path= {"/greeting","/"}, method=RequestMethod.GET)
	public String displayGreeting() {
		
		return "greeting";
	}
	
	@RequestMapping(path="/favPage1", method=RequestMethod.POST)
	public String postFavPage1(@RequestParam String color, ModelMap model) {
		FavThings fav = new FavThings();
		fav.setColor(color); 
		
		model.addAttribute("favThings",fav);
		return "redirect:/favPage2";
		
	}
	
	@RequestMapping(path="/favPage2", method=RequestMethod.GET)
	public String displayFavPage2() {
		return "favPage2";
	}
	
	@RequestMapping(path="/Page2input", method=RequestMethod.POST)
	public String page2Input(@RequestParam String food, ModelMap model) {
		
		FavThings fav = (FavThings) model.get("favThings");
		fav.setFood(food);
		return "redirect:/favPage3";
	}
	
	@RequestMapping(path="/favPage3", method=RequestMethod.GET)
	public String displayFavPage3() {
		return "favPage3";
	}
	
	@RequestMapping(path="/Page3input", method=RequestMethod.POST)
	public String page3Input(@RequestParam String season, ModelMap model) {
		
		FavThings fav = (FavThings) model.get("favThings");
		fav.setSeason(season);
		return "redirect:/favThings";
	}
	
	@RequestMapping(path="/favThings", method=RequestMethod.GET)
	public String favThings() {
		return "favThings";
	}
}
