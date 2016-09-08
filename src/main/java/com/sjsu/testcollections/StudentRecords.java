package com.sjsu.testcollections;

import java.util.HashMap;

public class StudentRecords {

	public StudentRecords() {

	}

	// HashMap used to store student records with the student ID as the key
	private HashMap<String, StudentBean> studentRecords;

	/**
	 * @return the studentRecords
	 */
	public HashMap<String, StudentBean> getStudentRecords() {
		return studentRecords;
	}

	/**
	 * @param studentRecords
	 *            the studentRecords to set
	 */
	public void setStudentRecords(HashMap<String, StudentBean> studentRecords) {
		this.studentRecords = studentRecords;
	}

	/**
	 * Adds records 'studentInfo' to the HashMap with the student ID as the key
	 * 
	 * @author Varsha Kankariya
	 * @param studentInfo
	 */
	public void addStudentRecord(StudentBean studentInfo) {

		StudentBean value = studentRecords.put(studentInfo.getStudentId(), studentInfo);

		System.out.println("Student record inserted successfully!!!");

	}

	/**
	 * Display student record details from the map by using the student Id as
	 * the key
	 * 
	 * @author Varsha Kankariya
	 * @param studentId
	 */
	public void displayStudentRecord(String studentId) {

		StudentBean studentInfo = studentRecords.get(studentId);
		// If null is returned, then no record was present in the List
		if (studentInfo == null) {
			System.out.println("There is not record for th given student ID!!!");
		} else {
			System.out.println("Record retrieved successfully!!! Following are the details : ");
			System.out.println("Student ID  : " + studentInfo.getStudentId());
			System.out.println("Name        : " + studentInfo.getFullName());
			System.out.println("Address     : " + studentInfo.getAddress());
		}

	}

	/**
	 * Removes student record from the Map using the student ID as the key
	 * 
	 * @author Varsha Kankariya
	 * @param studentId
	 * @return
	 */
	public StudentBean removeStudentRecord(String studentId) {

		// Remove the record
		StudentBean studentInfo = studentRecords.remove(studentId);

		System.out.println("Student record deleted successfully");
		return studentInfo;
	}

}
