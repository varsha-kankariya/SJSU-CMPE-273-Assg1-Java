package com.sjsu.testinterfaces;

import java.util.ArrayList;

/**
 * Class that contains methods to perform operations on Student Bean
 * 
 * @author Varsha Kankariya
 */
public class StudentInfo implements PersonInfo {

	// List to hold all the records of students
	private ArrayList<StudentBean> studentList;

	public StudentInfo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the studentList
	 */
	public ArrayList<StudentBean> getStudentList() {
		return studentList;
	}

	/**
	 * @param studentList
	 *            the studentList to set
	 */
	public void setStudentList(ArrayList<StudentBean> studentList) {
		this.studentList = studentList;
	}

	/**
	 * Adds new record to {@code studentList}. The details of the student are
	 * passed as a parameter {@code personInfo} to the method which is then
	 * added to arraylist.
	 */

	@Override
	public void addNewRecord(PersonBean personInfo) {

		StudentBean studentInfo = (StudentBean) personInfo;
		studentList.add(studentInfo);
		System.out.println("Added New Record!!!");

	}

	/**
	 * Deletes a student record with the given studentId.
	 */
	@Override
	public void deleteRecord(int Id) {

		// Flag indicating if the record was deleted successfully
		boolean isDeleted = false;

		// Check if the list is empty or not
		if (!studentList.isEmpty()) {
			// Traverse through the records list
			for (StudentBean studentInfo : studentList) {
				// If the record is found
				if (studentInfo.getStudentId().intValue() == Id) {
					// Remove the record
					studentList.remove(studentInfo);
					// Mark the flag to indicate successful deletion
					isDeleted = true;
					break;
				}
			}
			// If the record list is empty,display the message to the user.
			if (isDeleted) {
				System.out.println("Student record deleted!!");
			} else {
				System.out.println("No student record with given ID!!");
			}
		} else {
			System.out.println("Student List is empty");
		}

	}

	/**
	 * Displays a student record to the user with the given student Id
	 */
	@Override
	public void displayRecord(int Id) {
		// Check if the record list is empty
		if (!studentList.isEmpty()) {
			// Traverse through the list
			for (StudentBean studentInfo : studentList) {
				// If the record is found, display the details to the user
				if (studentInfo.getStudentId().intValue() == Id) {
					System.out.println("Id : " + studentInfo.getStudentId());
					System.out.println("Name : " + studentInfo.getFullName());
					System.out.println("Address : " + studentInfo.getAddress());
				}
			}

		}
		// If the record list is empty,display the message to the user.
		else {
			System.out.println("Student List is empty");
		}

	}

}
