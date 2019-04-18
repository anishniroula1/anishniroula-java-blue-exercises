package com.techelevator.workout;

import org.hibernate.validator.constraints.NotBlank;

public class Workout {
	
	private String code;
	
	@NotBlank(message="Please fill out the field")
	private String imageName;
	
	@NotBlank(message="Please fill out the field")
	private String workoutName;
	
	@NotBlank(message="Please fill out the field")
	private String instructions;
	
	@NotBlank(message="Please fill out the field")
	private String videolink;
	
	@NotBlank(message="Please fill out the field")
	private String timeLength;
	
	@NotBlank(message="Please fill out the field")
	private String bodyLocation;
	
	@NotBlank(message="Please fill out the field")
	private String typesOfExercise;
	
	@NotBlank(message="Please fill out the field")
	private String choiceThatFallUnder;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getWorkoutName() {
		return workoutName;
	}

	public void setWorkoutName(String workoutName) {
		this.workoutName = workoutName;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public String getVideolink() {
		return videolink;
	}

	public void setVideolink(String videolink) {
		this.videolink = videolink;
	}

	public String getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(String timeLength) {
		this.timeLength = timeLength;
	}

	public String getBodyLocation() {
		return bodyLocation;
	}

	public void setBodyLocation(String bodyLocation) {
		this.bodyLocation = bodyLocation;
	}

	public String getTypesOfExercise() {
		return typesOfExercise;
	}

	public void setTypesOfExercise(String typesOfExercise) {
		this.typesOfExercise = typesOfExercise;
	}

	public String getChoiceThatFallUnder() {
		return choiceThatFallUnder;
	}

	public void setChoiceThatFallUnder(String choiceThatFallUnder) {
		this.choiceThatFallUnder = choiceThatFallUnder;
	}

	
	
}

