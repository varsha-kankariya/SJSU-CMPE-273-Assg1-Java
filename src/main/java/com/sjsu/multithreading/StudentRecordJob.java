package com.sjsu.multithreading;

/**
 * A runnnable job that allows students(here threads) to enroll into a
 * particular course. THe course capacity is set so that only 4 students can be
 * enrolled into the course.
 * 
 * @author Varsha Kankariya
 */
public class StudentRecordJob implements Runnable {

	/**
	 * A bean that has all the student details
	 */
	private StudentDTO studentInfo = new StudentDTO();

	// A counter to assign unique ID to the students when they enroll
	private static int studentIdCounter = 1;

	public StudentRecordJob() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Invoked when a thread starts running a job.It then invokes the actual
	 * method that adds the students to the course.
	 */
	public void run() {

		addStudentToTheCourse();

	}

	/**
	 * Synchronized method to enroll a student to the course.It first checks the
	 * capacity of the course.If there is still some space left then, it will
	 * add the student to the course else it will inform the student that he/she
	 * could not enroll
	 * 
	 * @author Varsha Kankariya
	 */
	public synchronized void addStudentToTheCourse() {

		System.out.println(Thread.currentThread().getName() + " is about to enroll in the course");

		// Check if the class capacity is full
		if (studentInfo.getTotalNoOfStudents() <= 3) {

			// Get the unique ID to assign the student
			int studentId = studentIdCounter++;
			// If the seats are available, then assign the ID to the student and
			// add him/her to the list.
			studentInfo.addNewRecord(String.valueOf(studentId));
			System.out.println(Thread.currentThread().getName() + " enrolled in the course with Id " + studentId);

		}
		// If the space is not available, then inform the student
		else {
			System.out.println(Thread.currentThread().getName() + " could not enroll.The course capacity is full!!");
		}

	}

}
