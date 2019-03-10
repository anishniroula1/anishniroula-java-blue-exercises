package com.techelevator.validation.model;

import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Login {
	
	@NotBlank(message="Email is Required")
	@Email(message="Email Must be Valid Email Address")
	private String email;
	
	@NotBlank(message="Please Enter Your Password")
	private String password;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
