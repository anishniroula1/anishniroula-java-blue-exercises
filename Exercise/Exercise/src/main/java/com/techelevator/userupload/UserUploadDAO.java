package com.techelevator.userupload;

import java.util.List;

public interface UserUploadDAO {
	
	public List<UserUpload> getAllList();
	
	public UserUpload readyById(long id);
	
	public void saveUserUpload(UserUpload user);
	
	public void updateById(UserUpload user, long id);
	
	public void deleteById(long id);

}
