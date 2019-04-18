package com.techelevator.workout;

import java.util.List;

public interface WorkoutDAO {
	
	public void saveWorkout (Workout workout);
	
	public void updateWorkout(Workout workout, String code);
	
	public void deleteByWorkoutCode(String workoutCode);
	
	public List<Workout> displayWorkout();
	
	public Workout displayWorkoutByCode(String workoutCode);

}
