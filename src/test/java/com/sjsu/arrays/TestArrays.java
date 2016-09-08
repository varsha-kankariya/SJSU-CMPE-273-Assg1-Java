package com.sjsu.arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestArrays {

	StudentDetails studentDetails;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		studentDetails = new StudentDetails();
		studentDetails.setStudentRecords(new Student[20]);
	}

	@After
	public void tearDown() throws Exception {

		studentDetails = null;

	}

	
	@Test
	public void testAddNewStudent() {

		Student studentInfo = studentDetails.addNewStudent();
		Assert.assertNotNull("Student Record not created properly", studentInfo);
		Assert.assertEquals("Record was not created", new Integer(1),
				new Integer(studentDetails.getNoOfStudentRecords()));

		Student studentInfo2 = studentDetails.addNewStudent();
		Assert.assertNotNull("Student Record not created properly", studentInfo2);
		Assert.assertEquals("Record was not created", new Integer(2),
				new Integer(studentDetails.getNoOfStudentRecords()));
		
	}

	
	@Test
	public void testRemoveStudentRecordWithIdPresent() {
		createStudentRecords();
		studentDetails.removeStudentRecord("2");
		Assert.assertEquals("Student Record Not Deleted Properly", new Integer(1),
				new Integer(studentDetails.getNoOfStudentRecords()));
	}
	
	
	@Test
	public void testRemoveStudentRecordWithIdNotPresent() {
		createStudentRecords();
		studentDetails.removeStudentRecord("4");
		Assert.assertEquals("Student Record Not Deleted Properly", new Integer(2),
				new Integer(studentDetails.getNoOfStudentRecords()));
	}

	private void createStudentRecords() {
		// TODO Auto-generated method stub
		studentDetails.addNewStudent();
		studentDetails.addNewStudent();
	}

	
	@Test
	public void testAddCoursesForSuccess() {
		//While entering the courses during new record creation, add 1 or 2 courses
		studentDetails.addNewStudent();
		studentDetails.addCourses("1", "Ent");
	}

	
	@Test
	public void testAddCoursesForFailure() {
		
		//While entering the courses during new record creation, add 3 courses
		studentDetails.addNewStudent();
		studentDetails.addCourses("1", "Ent");
	}
}
