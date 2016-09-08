package com.sjsu.testqueues;

import java.util.Queue;

/**
 * Class to perform operations on the waitlist for the course maintained.
 * 
 * @author Varsha Kankariya
 */
public class CourseWaitlist {

	// Queue that holds the studentId waiting for getting enrolled in a course
	private Queue<String> courseWaitList;

	/**
	 * @return the courseWaitList
	 */
	public Queue<String> getCourseWaitList() {
		return courseWaitList;
	}

	/**
	 * @param courseWaitList
	 *            the courseWaitList to set
	 */
	public void setCourseWaitList(Queue<String> courseWaitList) {
		this.courseWaitList = courseWaitList;
	}

	public CourseWaitlist() {

	}

	/**
	 * Adds new student to the waitlist. The new entry is done at the end of the
	 * queue
	 * 
	 * @author Varsha Kankariya
	 * @param studentId
	 */
	public void addStudentToWaitlist(String studentId) {

		// If the student is added successfully to the end of the queue, 'true'
		// is returned, else 'false' is returned
		boolean isAdded = courseWaitList.offer(studentId);

		if (isAdded) {
			System.out.println("Student added to waitlist successfully!!");
		} else {
			System.out.println("Studeent couldn't be added to waitlist!!");
		}
	}

	/**
	 * Removes first student from the waitlist
	 * 
	 * @author Varsha Kankariya
	 */
	public void removeStudentFromWaitlist() {

		String studentId = null;

		// If the waitlist is not empty, then perform remove operation
		if (!courseWaitList.isEmpty()) {
			// Remove the student entry in front of the list
			studentId = courseWaitList.poll();
			if (studentId == null) {
				System.out.println("Could not remove student from the list!!");
			} else {
				System.out.println("Removed student successfully from the list!!");
			}

		} else {

			System.out.println("Wailtlist is empty!!!");
		}

	}

	
	/**
	 * Displays first student in the list without removing him/her from the list
	 * @author Varsha Kankariya
	 */
	
	public void displayFirstStudentInWaitList() {

		String studentId = null;
		//If the list is not empty
		if (!courseWaitList.isEmpty()) {
			//Check the first student's Id
			studentId = courseWaitList.peek();
			if (studentId == null) {
				System.out.println("Could not check first student in the list!!");
			} else {
				System.out.println("Retrieved student details first in the queue!! Student Id : " + studentId);
			}

		} else {

			System.out.println("Wailtlist is empty!!!");
		}

	}

	/**
	 * Empties the waitlist
	 * @author Varsha Kankariya
	 */
	public void emptyWaitList() {

		//Keep removing the students until the list is empty
		while (!courseWaitList.isEmpty()) {
			courseWaitList.poll();
		}
		System.out.println("Emptied the waitlist!!!");
	}

}
