package com.cisc181.core;

import java.util.Date;
import java.util.UUID;
import com.cisc181.eNums.eMajor;


public class Course 
{
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	


	public Course(String string, int i, eMajor physics) {
		// TODO Auto-generated constructor stub
	}

	public UUID getCourseID() {
		return CourseID;
	}	

	public String getCourseName() {
		return CourseName;
	}
	
	public int getGradePoints() {
		return GradePoints;
	}

	public eMajor getMajor() {
		return Major;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	public void setGradePoints(int gradePoints) {
		GradePoints = gradePoints;
	}
	
	public void setMajor(eMajor major) {
		Major = major;
	}

	
}
