package com.techelevator.userupload;

import java.time.LocalDateTime;
public class UserUpload {
	
//	id
//	username
//	profilepicture
//	regularupload
//	filelocation
//	userpost
//	date_time
//	
	private long id;	
	private String userName;
	private String profilePicture;
	private String regularUpload;
	private String fileLocation;
	private String userPost;
	private LocalDateTime dateTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfilePicture() {
		return profilePicture;
	}
	public void setProfilePicture(String profilePicture) {
		this.profilePicture = profilePicture;
	}
	public String getRegularUpload() {
		return regularUpload;
	}
	public void setRegularUpload(String regularUpload) {
		this.regularUpload = regularUpload;
	}
	public String getFileLocation() {
		return fileLocation;
	}
	public void setFileLocation(String fileLocation) {
		this.fileLocation = fileLocation;
	}
	public String getUserPost() {
		return userPost;
	}
	public void setUserPost(String userPost) {
		this.userPost = userPost;
	}
	public LocalDateTime getDateTime() {
		return dateTime;
	}
	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	
	
	
	
	
}


