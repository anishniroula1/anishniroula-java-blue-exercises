package com.techelevator.workout;

import java.util.List;

public interface WorkoutInstructionDAO {
	
	public List<WorkoutInstruction> getInstructionByCode(String code);

}
