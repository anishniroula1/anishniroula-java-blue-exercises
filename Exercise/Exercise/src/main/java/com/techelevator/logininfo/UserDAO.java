package com.techelevator.logininfo;
/*
 * This class is interface, where DAO were called
 */
import java.util.List;

public interface UserDAO {

	
	public void createUser(User saveUser);
	
	public void createLoginRecord(User saveLoginLog);
	
    public boolean isUsernameAndPasswordValid(String userName,String email, String password);
    
    public User findUserByUsername(String userName);
    
    public User findUserByEmail(String email);
    
    public User findNameByUserName(String userName);
    
    public User findUserRoleByUserName(User userRole);
    
//   // public void updatePaswordByUserName(User user,String userName);
//    public void updatePaswordByUserName(String password,String userName);


    
}
