package com.techelevator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {

	@Autowired
	ReviewDao reviewDao;
	
	@RequestMapping(path="/reviewBook", method=RequestMethod.GET)
	public String createReviewForm() {
		
		return "reviewBook";
	}
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String ReviewForm() {
		
		return "reviewBook";
	}
	
	
	@RequestMapping(path="/postMessage", method=RequestMethod.POST)
	public String createNewReview(Review review) {
		LocalDateTime a = LocalDateTime.now();
		review.setDateSubmitted(a);
		reviewDao.save(review);
		return "redirect:/showMessage";
		
	}
	
	@RequestMapping(path="/showMessage", method=RequestMethod.GET)
	public String displayMessage(HttpServletRequest request) {
		List<Review> reviews = reviewDao.getAllReviews();
		request.setAttribute("reviews", reviews);
		return "showMessage";
		
	}
	
}
