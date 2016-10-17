package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Section 
{
	private UUID SectionID;
	private UUID CourseID;
	private UUID SemesterID;
	private int RoomID;

	public Section(UUID courseID2, UUID semesterID2, int i) {
		// TODO Auto-generated constructor stub
	}

	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public UUID getCourseID() {
		return CourseID;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
}
