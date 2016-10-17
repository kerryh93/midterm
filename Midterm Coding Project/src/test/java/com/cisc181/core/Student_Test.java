package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;
import Excpetion.PersonException;
import java.util.Date;
import com.cisc181.eNums.eMajor;
import java.util.UUID;


public class Student_Test{
	static ArrayList<Student> studentList = new ArrayList<Student>();
	static ArrayList<Course> courseList = new ArrayList<Course>();
	static ArrayList<Semester> semesterList = new ArrayList<Semester>();
	static ArrayList<Section> sectionList = new ArrayList<Section>();
	static ArrayList<Enrollment> enrollmentList = new ArrayList<Enrollment>();

	public static Date newDate(int year, int month, int day){
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		Course Physics = new Course("Physics", 100, eMajor.PHYSICS);
		Course Nursing = new Course("Nursing", 100, eMajor.NURSING);
		Course Chemistry = new Course("Chemistry", 100, eMajor.CHEM);
		courseList.add(Physics);
		courseList.add(Nursing);
		courseList.add(Chemistry);

		Semester spring = new Semester(newDate(2016, 2, 5), newDate(2016, 5, 29));
		Semester fall = new Semester(newDate(2016, 9, 9), newDate(2016, 12, 18));
		semesterList.add(spring);
		semesterList.add(fall);

		Section firstPhystudent100 = new Section(Physics.getCourseID(), fall.getSemesterID(), 100);
		Section firstNurstudent100 = new Section(Nursing.getCourseID(), fall.getSemesterID(), 101);
		Section firstChem100 = new Section(Chemistry.getCourseID(), fall.getSemesterID(), 102);
		Section secondPhystudent100 = new Section(Physics.getCourseID(), spring.getSemesterID(), 100);
		Section secondNurstudent100 = new Section(Nursing.getCourseID(), spring.getSemesterID(), 101);
		Section secondChem100 = new Section(Chemistry.getCourseID(), spring.getSemesterID(), 102);
		sectionList.add(firstPhystudent100);
		sectionList.add(firstNurstudent100);
		sectionList.add(firstChem100);
		sectionList.add(secondPhystudent100);
		sectionList.add(secondNurstudent100);
		sectionList.add(secondChem100);

		Student student1 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.CHEM, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student2 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.PHYSICS, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student3 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.NURSING, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student4 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.CHEM, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student5 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.BUSINESS, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student6 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.CHEM, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student7 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.NURSING, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student8 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.PHYSICS, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student9 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.BUSINESS, "Anywhere",
				"(555)-555-5555", "student@email.com");
		Student student10 = new Student("first", "middle", "last", newDate(1998, 1, 11), eMajor.CHEM, "Anywhere",
				"(555)-555-5555", "student@email.com");

		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		studentList.add(student6);
		studentList.add(student7);
		studentList.add(student8);
		studentList.add(student9);
		studentList.add(student10);
		
		
		for (Section section : sectionList){
			for (Student student : studentList){
				enrollmentList.add(new Enrollment(student.getStudentID(), section.getSectionID()));
			}
		}
	}
	
	public long GPA(UUID studentID){
		long gpa = 0;
		for(Enrollment enrollment : enrollmentList){
			if(enrollment.getStudentID() == studentID){
				if(enrollment.getGrade() > 89){
					gpa += 4.0;
				} else if(enrollment.getGrade() > 79){
					gpa += 3.0;
				} else if(enrollment.getGrade() > 69){
					gpa += 2.0;
				}else if(enrollment.getGrade() > 59){
					gpa += 1.0;
				}else{
					gpa += 0.0;
				}
			}
		}
		long averageGPA = gpa / sectionList.size();
		return averageGPA;
	}

	public long Courseaverage(UUID sectionID) {
		long courseaverage = 0;
		for(Enrollment e : enrollmentList){
			if(e.getSectionID() == sectionID){
				courseaverage += e.getGrade();
			}
		}
		long averageCourseGrd = courseaverage / 10;
		averageCourseGrd *= 100;
		averageCourseGrd /= 100;
		return averageCourseGrd;
	}{

	
	
	for(Enrollment enrolled : enrollmentList) {
		if(enrolled.getStudentID() == studentList.get(0).getStudentID() || enrolled.getStudentID() == studentList.get(1).getStudentID()) {
				enrolled.setGrade(100.0);
		}else if(enrolled.getStudentID() == studentList.get(2).getStudentID() || enrolled.getStudentID() == studentList.get(3).getStudentID()) {
				enrolled.setGrade(90.0);
		}else if(enrolled.getStudentID() == studentList.get(4).getStudentID() || enrolled.getStudentID() == studentList.get(5).getStudentID()) {
				enrolled.setGrade(80.0);
		}else if(enrolled.getStudentID() == studentList.get(6).getStudentID() || enrolled.getStudentID() == studentList.get(7).getStudentID()) {
				enrolled.setGrade(75.0);
		}else if(enrolled.getStudentID() == studentList.get(8).getStudentID() || enrolled.getStudentID() == studentList.get(9).getStudentID()) {
				enrolled.setGrade(60.0);
		}else{
			if(enrolled.getSectionID() == sectionList.get(0).getSectionID()) {
				enrolled.setGrade(50);
		}
			
		}
	}
	}
	
	
	
	@Test
	public void testGPAaverage(){
		assertEquals(GPA(enrollmentList.get(0).getStudentID()), 4);
		assertEquals(GPA(enrollmentList.get(1).getStudentID()), 4);
		assertEquals(GPA(enrollmentList.get(2).getStudentID()), 4);
		assertEquals(GPA(enrollmentList.get(3).getStudentID()), 4);
		assertEquals(GPA(enrollmentList.get(4).getStudentID()), 3);
		assertEquals(GPA(enrollmentList.get(5).getStudentID()), 3);
		assertEquals(GPA(enrollmentList.get(6).getStudentID()), 2);
		assertEquals(GPA(enrollmentList.get(7).getStudentID()), 2);
		assertEquals(GPA(enrollmentList.get(8).getStudentID()), 1);
		assertEquals(GPA(enrollmentList.get(9).getStudentID()), 1);
		
		assertEquals(Courseaverage(enrollmentList.get(0).getSectionID()), 81);
	
		assertEquals(Courseaverage(enrollmentList.get(11).getSectionID()),81);
		
		assertEquals(Courseaverage(enrollmentList.get(21).getSectionID()), 81);
	
		assertEquals(Courseaverage(enrollmentList.get(0).getSectionID()), 81);
		assertEquals(Courseaverage(enrollmentList.get(11).getSectionID()), 81);

		assertEquals(Courseaverage(enrollmentList.get(21).getSectionID()), 81);
	}


	@Test
	public void testMajorChange() {
		assertTrue(studentList.get(0).getMajor() == eMajor.CHEM);
		studentList.get(0).setMajor(eMajor.PHYSICS);
		assertTrue(studentList.get(0).getMajor() == eMajor.PHYSICS);
	}

}
