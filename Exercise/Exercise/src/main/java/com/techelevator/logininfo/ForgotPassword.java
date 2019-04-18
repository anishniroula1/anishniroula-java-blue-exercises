package com.techelevator.logininfo;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class ForgotPassword {

	
	@NotBlank(message="Please Create your Username")
	@Size(min=3,message="Please enter a Username longer than 3 character")
	private String userName;
	
	@NotBlank(message="Please Enter the Password")
	@Size(min=8,message="Please enter the Password longer than 8 character")
	private String password;
	
	@NotBlank(message="Password does not match")
	private String verifyPassword;
	
	@AssertTrue(message="Password didn't match")
	public boolean isPasswordMatching() {
		if(password !=null) {
			return password.equals(verifyPassword);
		}
		return false;
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
	
	
}
