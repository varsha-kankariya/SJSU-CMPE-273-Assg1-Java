package com.sjsu.arrays;

/**
 * Contract to define the operations that a object should implement when using
 * this interface
 * 
 * @author Varsha Kankariya
 *
 */
public interface StudentInfoAsArrays {

	// Method contract to define the operation of adding a new student
	public Student addNewStudent();

	// Method contract to define the operation to remove a particular student
	// record from the list
	public void removeStudentRecord(String studentId);

	// Method contract to define the operation to add courses to the existing
	// record of a student.
	public Student addCourses(String studentId, String courseName);

}
