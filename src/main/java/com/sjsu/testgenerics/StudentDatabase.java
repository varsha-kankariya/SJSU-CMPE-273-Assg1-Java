package com.sjsu.testgenerics;

import java.util.ArrayList;

import com.sjsu.testgenerics.StudentBean;

public class StudentDatabase {

	public StudentDatabase() {

	}

	// Arraylist to hold all the records of students
	ArrayList<StudentBean> studentRecords;

	/**
	 * @return the studentRecords
	 */
	public ArrayList<StudentBean> getStudentRecords() {
		return studentRecords;
	}

	/**
	 * @param studentRecords
	 *            the studentRecords to set
	 */
	public void setStudentRecords(ArrayList<StudentBean> studentRecords) {
		this.studentRecords = studentRecords;
	}

	/**
	 * Adds student record to the list
	 * 
	 * @author Varsha Kankariya
	 * @param studentInfo
	 */
	public void addStudentInfo(StudentBean studentInfo) {

		studentRecords.add(studentInfo);

		System.out.println("Student record inserted successfully!!!");
	}

	public void displayAllStudentRecords() {

		for (StudentBean studentInfo : studentRecords) {

			System.out.println("------------------------------------------------------------------");
			System.out.println("Student ID : " + studentInfo.getStudentId());
			System.out.println("Name       : " + studentInfo.getFullName());
			System.out.println("Address    : " + studentInfo.getAddress());
			System.out.println("------------------------------------------------------------------");
		}

	}
	

}
