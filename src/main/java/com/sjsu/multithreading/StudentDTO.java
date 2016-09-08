package com.sjsu.multithreading;

import java.util.ArrayList;

/**
 * A bean that performs operations on the student details.Here we have done the
 * operations only on the student ID
 * 
 * @author Varsha Kankariya
 */
public class StudentDTO {

	public StudentDTO() {

	}

	//Holds the student IDs of those who have successfully enrolled into the course.ArrayList is not thread-safe
	private ArrayList<String> studentList = new ArrayList<String>();

	/**
	 * Adds new student with the give ID {@code studentId} into the list(course)
	 * @author Varsha Kankariya
	 * @param studentId
	 */
	public void addNewRecord(String studentId) {

		studentList.add(studentId);
		System.out.println("Added new record with ID : " + studentId);
	}

	/**
	 * Returns the current count of students enrolled into the course
	 * @author Varsha Kankariya
	 * @return
	 */
	public int getTotalNoOfStudents() {

		return studentList.size();
	}

}
