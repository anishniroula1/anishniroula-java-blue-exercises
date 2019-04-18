package com.techelevator.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.userupload.UserUpload;
import com.techelevator.userupload.UserUploadDAO;

@RestController
@CrossOrigin
@RequestMapping("/api/userupload")
public class UserUploadRestController {

	@Autowired
	private UserUploadDAO userUploadDao;
	
	@GetMapping
	public List<UserUpload> list(){
		return userUploadDao.getAllList();
	}
	
	@GetMapping("/{id}")
	public UserUpload read(@PathVariable long id) {
		return userUploadDao.readyById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public UserUpload create(@RequestBody UserUpload user) {
		userUploadDao.saveUserUpload(user);
		return user;
		
	}
	
	@PutMapping("/{id}")
	public UserUpload updateUserUpload(@RequestBody UserUpload upload, @PathVariable long id) {
		UserUpload user = userUploadDao.readyById(id);
		if(user !=null) {
			userUploadDao.updateById(upload,id);
		}
		return upload;
		
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable long id) {
		UserUpload user = userUploadDao.readyById(id);
		if(user != null) {
			userUploadDao.deleteById(id);
		}
	}
}
