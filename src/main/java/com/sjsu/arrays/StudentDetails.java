package com.sjsu.arrays;

import java.util.Scanner;

public class StudentDetails implements StudentInfoAsArrays {

	// Array holding student records
	private Student[] studentRecords;

	// Counter for student ID
	static private int studentIdCounter = 1;

	// Indicates total no of records
	private int noOfStudentRecords = 0;

	// 'Scanner' object for taking inputs from user
	private Scanner userInput = new Scanner(System.in);

	public StudentDetails() {

	}

	/**
	 * Adds new student records. Inputs for the details are taken from the user.
	 */
	@Override
	public Student addNewStudent() {

		// Object to hold student information
		Student studentInfo = new Student();

		// Get student name
		System.out.println("Enter full name (first_name last_name):");
		studentInfo.setName(userInput.next());

		// No. of maximum courses that student can take is 3
		int maxNoOfCourses = 3;
		studentInfo.setStudentId(String.valueOf(studentIdCounter++));
		studentInfo.setMaxNoOfCourses(maxNoOfCourses);
		studentInfo.setCourseNames(new String[10]);

		// Variable to hold actual no of courses that student has taken
		int noOfCourses = 0;
		String isPositive;
		// Loop to take course details from the user
		do {
			System.out.println("Do you want to add courses?(Y/N) ");
			isPositive = userInput.next();

			if (isPositive.equals("Y")) {

				System.out.println("Enter course name :");
				String courseName = userInput.next();
				studentInfo.getCourseNames()[noOfCourses] = courseName;
				noOfCourses++;
			} else {

				break;
			}

		} while ((isPositive.equals("Y")) && (noOfCourses < maxNoOfCourses));
		// Set the actual no of courses taken by the student
		studentInfo.setActualNoOfCourses(noOfCourses);
		studentRecords[noOfStudentRecords] = studentInfo;
		// Increase the count for no of student records by 1
		noOfStudentRecords++;
		System.out.println("Added new student record successfully!!!");
		return studentInfo;
	}

	/**
	 * Removes the student record with the student ID 'studentID' if present
	 */
	@Override
	public void removeStudentRecord(String studentId) {

		// Boolean indicating if the student record was deleted
		boolean deleted = false;
		// Traverse through the student records
		for (int i = 0; i < noOfStudentRecords; i++) {

			Student studentInfo = studentRecords[i];
			// If the record is found
			if (studentInfo.getStudentId().equals(studentId)) {
				// Make the object as null
				studentRecords[i] = null;
				// Move all the records 1 index ahead
				fillDeletedRecordSpace(i);
				// Mark the boolean as true
				deleted = true;
			}
			// If the record is not found continue searching
			else {
				continue;
			}

		}
		// Display message based on the value of boolean value 'deleted'
		if (deleted) {
			System.out.println("Removed the student record with student Id: " + studentId);
		} else {
			System.out.println("Could not find the record!!Please check the ID again!!");
		}

	}

	// Moves all the records 1 index ahead in case a student record is deleted
	private void fillDeletedRecordSpace(int emptyArrayRecordIndex) {

		for (int i = emptyArrayRecordIndex; i < noOfStudentRecords; i++) {

			studentRecords[i] = studentRecords[i + 1];
		}
		studentRecords[noOfStudentRecords] = null;
		noOfStudentRecords--;

	}

	/**
	 * Adds courses to the already present list of the courses of a student.If
	 * the list has already reached its limit, then the new course is not added
	 */
	@Override
	public Student addCourses(String studentId, String courseName) {

		boolean isRecordPresent = false;
		boolean isCourseAdded = false;
		// First search for the student record based on the 'studentId' as input
		for (int i = 0; i < noOfStudentRecords; i++) {

			Student studentInfo = studentRecords[i];
			// If the record is found
			if (studentInfo.getStudentId().equals(studentId)) {

				// Get maximum no of courses that can be added to the list for
				// the student
				int maxNoOfCourses = studentInfo.getMaxNoOfCourses();
				// Get actual no of courses that can be added to the list for
				// the student
				int actualNoOfCourses = studentInfo.getActualNoOfCourses();
				// If the threshold has not been reached, then add the course
				if (actualNoOfCourses < maxNoOfCourses) {
					studentInfo.getCourseNames()[actualNoOfCourses] = courseName;
					// Mark the boolean indicating that the course has been
					// added
					isCourseAdded = true;
				}
				// If the threshold has reached, then display appropriate
				// message and break from the loop.
				else {
					System.out.println("Cannot add courses more than the set limit!!!");
					break;
				}
				// Mark the boolean indicating that the student record is
				// present
				isRecordPresent = true;

			} else {
				continue;
			}
			// If the record is present and the course has been added
			if (isRecordPresent && isCourseAdded) {
				System.out.println("Added Course!!");
			}
			else if (isRecordPresent == false) {
				System.out.println("Could not find the record!!Please try again!!");
			}

		}

		return null;
	}

	/**
	 * @return the studentRecords
	 */
	public Student[] getStudentRecords() {
		return studentRecords;
	}

	/**
	 * @param studentRecords
	 *            the studentRecords to set
	 */
	public void setStudentRecords(Student[] studentRecords) {
		this.studentRecords = studentRecords;
	}

	/**
	 * @return the noOfStudentRecords
	 */
	public int getNoOfStudentRecords() {
		return noOfStudentRecords;
	}

	/**
	 * @param noOfStudentRecords
	 *            the noOfStudentRecords to set
	 */
	public void setNoOfStudentRecords(int noOfStudentRecords) {
		this.noOfStudentRecords = noOfStudentRecords;
	}

}
