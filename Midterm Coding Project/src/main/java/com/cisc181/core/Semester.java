package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester 
{
	private UUID SemesterID;
	private Date StartDate; 
	private Date EndDate; 

	public Semester(){
		SemesterID = UUID.randomUUID();
	}
	public Date getStartDate() {
		return StartDate;
	}
	public Date getEndDate() {
		return EndDate;
	}
	public UUID getSemesterID(){
		return this.SemesterID;
	}
	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}
	public void setEndDate(Date endDate) {
		EndDate = endDate;
	}
	public Semester(Date startDate, Date endDate) {
		this();
		StartDate = startDate;
		EndDate = endDate;
	}
	
}