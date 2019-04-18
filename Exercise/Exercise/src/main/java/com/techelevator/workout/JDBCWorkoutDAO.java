package com.techelevator.workout;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import com.techelevator.logininfo.PasswordHasher;

@Component
public class JDBCWorkoutDAO implements WorkoutDAO {

	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JDBCWorkoutDAO(DataSource dataSource, PasswordHasher passwordHasher) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public void saveWorkout(Workout workout) {
		String sql = "INSERT INTO workout (code, imagename, workoutname, instructions, "
				+ "videolink, timelength, bodylocation, typesofexercise, choicethatfallunder) "
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
		String code = workout.getWorkoutName()+" "+workout.getBodyLocation();
		
		jdbcTemplate.update(sql,code, workout.getImageName(), workout.getWorkoutName(), workout.getInstructions(), workout.getVideolink(),
				workout.getTimeLength(), workout.getBodyLocation(), workout.getTypesOfExercise(), workout.getChoiceThatFallUnder());
		
		//This is for to save in workout Instruction
		String instructionSQL = "INSERT INTO workoutinstructions (code, instructions) VALUES (?,?)";
		
		String str = workout.getInstructions();
		String[] split  = str.split("\\|");
		
		for(String instruction: split) {
			jdbcTemplate.update(instructionSQL, code, instruction);
		}
	}
	
	@Override
	public void updateWorkout(Workout workout, String searchCode) {
		String updateSql = "UPDATE workout SET code = ?, imagename = ?, workoutname = ?, instructions = ?, "
				+ "videolink = ?, timelength = ?, bodylocation = ?, typesofexercise = ?, choicethatfallunder = ? WHERE code = ?";
		String newCode = workout.getWorkoutName()+" "+workout.getBodyLocation();
		
		jdbcTemplate.update(updateSql,newCode,workout.getImageName(), workout.getWorkoutName(), workout.getInstructions(), workout.getVideolink(),
				workout.getTimeLength(), workout.getBodyLocation(), workout.getTypesOfExercise(), workout.getChoiceThatFallUnder(),searchCode);
		
		String deleteSql = "DELETE FROM workoutinstructions WHERE code= ?";
		jdbcTemplate.update(deleteSql, searchCode);
		
		String instructionSQL = "INSERT INTO workoutinstructions (code, instructions) VALUES (?,?)";	
		String str = workout.getInstructions();
		String[] split  = str.split("\\|");
		
		for(String instruction: split) {
			jdbcTemplate.update(instructionSQL, newCode, instruction);
		}
	
	}
	
	@Override
	public void deleteByWorkoutCode(String workoutCode) {
		String deleteSql = "DELETE FROM workout WHERE code=?";
		jdbcTemplate.update(deleteSql, workoutCode); 
		
		String deleteInstructionsSql = "DELETE FROM workoutinstructions WHERE code= ?";
		jdbcTemplate.update(deleteInstructionsSql, workoutCode);
	}

	@Override
	public List<Workout> displayWorkout() {
		List<Workout> work = new ArrayList<Workout>();
		String sql = "SELECT code, imagename, workoutname, instructions, "
				+ "videolink, timelength, bodylocation, typesofexercise, choicethatfallunder FROM workout";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql);
		while(result.next()) {
			Workout w = mapRowToWorkOut(result);
			work.add(w);
		}
		
		return work;
	}

	@Override
	public Workout displayWorkoutByCode(String workoutCode) {
		Workout workout = null;
		String sql = "SELECT code, imagename, workoutname, instructions, "
				+ "videolink, timelength, bodylocation, typesofexercise, choicethatfallunder FROM workout WHERE code=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql,workoutCode);
		if(result.next()) {
			workout = mapRowToWorkOut(result);
		}
		return workout;
	}
	/*
	 * code
imagename
workoutname
instructions
videolink
timelength
bodylocation
typesofexercise
choicethatfallunder
	 */
	private Workout mapRowToWorkOut(SqlRowSet result){
		Workout w = new Workout();
		w.setCode(result.getString("code"));
		w.setImageName(result.getString("imagename"));
		w.setWorkoutName(result.getString("workoutname"));
		w.setInstructions(result.getString("instructions"));
		w.setVideolink(result.getString("videolink"));
		w.setTimeLength(result.getString("timelength"));
		w.setBodyLocation(result.getString("bodylocation"));
		w.setTypesOfExercise(result.getString("typesofexercise"));
		w.setChoiceThatFallUnder(result.getString("choicethatfallunder"));
		return w;	
	}
	
	

}
