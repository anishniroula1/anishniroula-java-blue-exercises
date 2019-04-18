package com.techelevator.restcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.techelevator.workout.Workout;
import com.techelevator.workout.WorkoutDAO;

@RestController
@CrossOrigin
@RequestMapping("/api/workout")
public class WorkoutRestController {

	@Autowired
	private WorkoutDAO workoutDao;
	
	@GetMapping
	public List<Workout> displayWorkout(){
		return workoutDao.displayWorkout();
	}
	
	@GetMapping("/{code}")
	public Workout displayWorkoutByCode(@PathVariable String code) {
		return workoutDao.displayWorkoutByCode(code);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Workout createWorkout(@RequestBody Workout workout) {
		workoutDao.saveWorkout(workout);
		return workout;	
	}
	
	@PutMapping("/{code}")
	public Workout updateWorkoutByCode(@RequestBody Workout workout, @PathVariable String code) {
		Workout check = workoutDao.displayWorkoutByCode(code);
		if(check !=null) {
			workoutDao.updateWorkout(workout, code);
		}
		return workout;
		
	}
	
	@DeleteMapping("/{code}")
	public void deleteWorkoutBycode(@PathVariable String code) {
		workoutDao.deleteByWorkoutCode(code);
	}
}
