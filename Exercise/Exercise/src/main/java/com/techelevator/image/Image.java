package com.techelevator.image;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class Image {
	

	private String name;
	
	private List<MultipartFile> file;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public List<MultipartFile> getFile() {
		return file;
	}
	public void setFile(List<MultipartFile> file) {
		this.file = file;
	}
	
	public String getImageName() {

		String fileNames="";
		for(MultipartFile file:file) {
			 fileNames = file.getOriginalFilename();
		}
	
		return fileNames;
	}
	

	

	
	
}
