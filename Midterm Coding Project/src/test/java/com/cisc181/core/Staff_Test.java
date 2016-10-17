package com.cisc181.core;

import static org.junit.Assert.*;

import com.cisc181.eNums.eTitle;


import Excpetion.PersonException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;


public class Staff_Test 
{
	static Staff RightEmployee;
	static Staff DecadeEmployee;
	static Staff WrongEmplpoyee;
	static Staff Employee;
	static Staff Employee2;
	
	static ArrayList<Staff> staffList = new ArrayList<Staff>();
	
	public static Date makeDate(int year, int month, int day)
	{
		Calendar date = Calendar.getInstance();
		date.set(year, month - 1, day);
		return date.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException
	{
		RightEmployee = new Staff("First", "Middle", "Last", new Date(), "Address", "(908)-555-5555", "1st Street", "email@email.com", 0, 60000.0, null, eTitle.MR);
		DecadeEmployee = new Staff("First", "Middle", "Last", new Date(), "Address", "(908)-555-5555", "1st Street", "email@email.com", 0, 40000, null, eTitle.MR );
		WrongEmplpoyee = new Staff("First", "Middle", "Last", new Date(), "Address", "(908)-555-5555", "1st Street", "email@email.com", 0, 60000, null, eTitle.MS);
		Employee = new Staff("First", "Middle", "Last", new Date(), "Address", "(908)-555-5555", "1st Street", "email@email.com", 0, 100000, null, eTitle.MRS);
		Employee2 = new Staff("First", "Middle", "Last", new Date(), "Address", "(908)-555-5555", "1st Street", "email@email.com", 0, 80000, null, eTitle.MRS);
				staffList.add(RightEmployee);
				staffList.add(DecadeEmployee);
				staffList.add(WrongEmplpoyee);
				staffList.add(Employee);
				staffList.add(Employee2);
			}
	
	@Test
	public void SalaryTest() {
	double Salary = ((60000 + 40000 +60000 + 100000 + 80000)/5);
	double total = 0;
	for (Staff s: staffList)
				total += s.getSalary();
	double Average = total/staffList.size();
			assertEquals(Salary,Average, .1);
		}	
	
	@Test(expected = PersonException.class)
	public void tooOldTest() throws PersonException{
	Calendar newCalendar =  Calendar.getInstance();
		newCalendar.set(Calendar.YEAR, 1915);
	Date newDate = newCalendar.getTime();
	DecadeEmployee.setDOB(newDate);
		}
	
	@Test
	public void CorrectNumberTest() throws PersonException{
	//Correct Number
	WrongEmplpoyee.setPhone("(908)-444-4444");
		}
	
	@Test(expected = PersonException.class)
	public void WrongNumberTest() throws PersonException{
	//Incorrect Number
	WrongEmplpoyee.setPhone("(908)-22-2222");
		}
	}