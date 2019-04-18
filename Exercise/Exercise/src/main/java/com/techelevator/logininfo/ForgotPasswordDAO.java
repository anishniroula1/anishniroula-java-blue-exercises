package com.techelevator.logininfo;

public interface ForgotPasswordDAO {
	
	public ForgotPassword findUserByUsername(String userName);
	public void updatePaswordByUserName(String password,String userName);
}
