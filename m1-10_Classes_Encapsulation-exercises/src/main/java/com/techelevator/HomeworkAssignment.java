package com.techelevator;

public class HomeworkAssignment {
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	//private String letterGrade;
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}
	
	public String getLetterGrade() {
		int newGrade = (int)(((double)totalMarks/(double)possibleMarks)*100);
		
		if(newGrade >=90) {
			return "A";
		}
		else if(newGrade >=80) {
			return "B";
		}
		else if(newGrade >=70) {
			return "C";
		}
		else if(newGrade >=60) {
			return "D";
		}
		else {
			return "F";
		}
		
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}
	

}
