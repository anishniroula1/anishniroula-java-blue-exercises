package com.techelevator.logininfo;
/*
 * This is User Model Bean class, for registering user, recording log and login and logout.
 * Few things will be added later
 */
import java.time.LocalDateTime;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {

	@NotBlank(message="Please enter your name")
	private String name;
	
	@NotBlank(message="Please enter an Email Address")
	@Email(message="Please Enter an Valid Email Address")
	private String email;
	
	
	@NotBlank(message="Please Create your Username")
	@Size(min=3,message="Please enter a Username longer than 3 character")
	private String userName;
	
	@NotBlank(message="Please Enter the Password")
	@Size(min=8,message="Please enter the Password longer than 8 character")
	private String password;
	
	@NotBlank(message="Password does not match")
	private String verifyPassword;
	
	@NotBlank(message="Please enter the Location: State")
	private String location;
	
	@NotBlank(message="Please Enter your Gender")
	private String gender;
	
	private String userRole;
	
	private LocalDateTime dateTime;
	
	@AssertTrue(message="Password didn't match")
	public boolean isPasswordMatching() {
		if(password !=null) {
			return password.equals(verifyPassword);
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVerifyPassword() {
		return verifyPassword;
	}

	public void setVerifyPassword(String verifyPassword) {
		this.verifyPassword = verifyPassword;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	
	
	
	}
