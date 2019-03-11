package com.techelevator.validation.model;

import java.time.LocalDate;
import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class Registration {
	
	@NotEmpty(message="You Must include First name")
	@Size(min=3, max=20,message="Must Be Between 3 to 20 character")
	private String firstName;
	
	@NotEmpty(message="You Must include Last name")
	@Size(min=3, max=20,message="Must Be Between 3 to 20 character")
	private String lastName;
	
	@NotBlank(message="Please Enter your Email")
	@Email(message="Please enter a Valid Email Address")
	private String email;
	
	@NotBlank(message="Email address does not match")
	private String verifyEmail;
	
	private boolean emailMatching;
	
	@NotBlank(message="Please Enter the password")
	@Size(min=8, message="Make sure your password length greater than 8")
	private String password;
	
	@NotBlank(message="Password do not match")
	private String verifyPassword;
	
	private boolean paswordMatching;
	
	
	@Pattern(regexp="^\\d{2}/\\d{2}/\\d{4}$", message="the Value Should be in MM/dd/yyyy")
	private String birthDate;
	
	@NotBlank(message="Please Enter number of Ticket")
	@Min(value=1, message="0 is not Acceptable, please add more then 1")
	@Max(value=10, message="Max value is 10, Please enter # below 11")
	private String numberOfTicket;
	

	@AssertTrue(message="Email Must Match")
	public boolean isEmailMatching() {
		if(email != null) {
			return email.equals(verifyEmail);
		}
		return false;
	}
	
	@AssertTrue(message="Password do not match")
	public boolean isPasswordMatching() {
		if(password != null) {
			return password.equals(verifyPassword);
		}
		return false;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getVerifyEmail() {
		return verifyEmail;
	}

	public void setVerifyEmail(String verifyEmail) {
		this.verifyEmail = verifyEmail;
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

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getNumberOfTicket() {
		return numberOfTicket;
	}

	public void setNumberOfTicket(String numberOfTicket) {
		this.numberOfTicket = numberOfTicket;
	}
	
	
}
