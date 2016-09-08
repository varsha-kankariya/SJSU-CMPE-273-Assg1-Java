package com.sjsu.arrays;

public class Student {

	public Student() {
		// TODO Auto-generated constructor stub
	}

	private String name;

	private String[] courseNames;

	private int maxNoOfCourses;

	private int actualNoOfCourses;

	private String studentId;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the courseNames
	 */
	public String[] getCourseNames() {
		return courseNames;
	}

	/**
	 * @param courseNames
	 *            the courseNames to set
	 */
	public void setCourseNames(String[] courseNames) {
		this.courseNames = courseNames;
	}

	/**
	 * @return the maxNoOfCourses
	 */
	public int getMaxNoOfCourses() {
		return maxNoOfCourses;
	}

	/**
	 * @param maxNoOfCourses
	 *            the maxNoOfCourses to set
	 */
	public void setMaxNoOfCourses(int maxNoOfCourses) {
		this.maxNoOfCourses = maxNoOfCourses;
	}

	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}

	/**
	 * @param studentId
	 *            the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the actualNoOfCourses
	 */
	public int getActualNoOfCourses() {
		return actualNoOfCourses;
	}

	/**
	 * @param actualNoOfCourses
	 *            the actualNoOfCourses to set
	 */
	public void setActualNoOfCourses(int actualNoOfCourses) {
		this.actualNoOfCourses = actualNoOfCourses;
	}

}
