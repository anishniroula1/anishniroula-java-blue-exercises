package com.techelevator.workout;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCWorkoutInstructionDAO implements WorkoutInstructionDAO {
	
private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCWorkoutInstructionDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<WorkoutInstruction> getInstructionByCode(String code) {
		List<WorkoutInstruction> workout = new ArrayList<WorkoutInstruction>();
		String sql = "SELECT * FROM workoutinstructions WHERE code=?";
		SqlRowSet result = jdbcTemplate.queryForRowSet(sql,code);
		while(result.next()) {
			WorkoutInstruction w = mapRowTOWorkoutInstruction(result);
			workout.add(w);
		}
		return workout;
	}
	
	public WorkoutInstruction mapRowTOWorkoutInstruction(SqlRowSet result) {
		WorkoutInstruction w = new WorkoutInstruction();
		w.setCode(result.getString("code"));
		w.setWorkoutInstruction(result.getString("instructions"));
		return w;
		
	}

}
