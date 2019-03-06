package com.techelevator;

import com.techelevator.dao.FilmDao;
import com.techelevator.dao.model.Film;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    private FilmDao filmDao;

    
    @RequestMapping("/filmList")
    public String showFilmSearchForm() {
        return "filmList";
    }

    @RequestMapping("/filmSearch")
    public String searchFilms(HttpServletRequest request) {
    	String genre = request.getParameter("genre");
    	String minLength = request.getParameter("minLength");
    	int lengthMin = Integer.parseInt(minLength);
    	String maxLength = request.getParameter("maxLength");
    	int leangthMax = Integer.parseInt(maxLength);
    	List<Film> films = filmDao.getFilmsBetween(genre, lengthMin, leangthMax);
        request.setAttribute("films", films);
    	return "filmList";
    }
    
    
}