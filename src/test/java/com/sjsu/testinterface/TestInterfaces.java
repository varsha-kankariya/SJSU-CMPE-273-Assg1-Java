package com.sjsu.testinterface;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.sjsu.testinterfaces.FacultyBean;
import com.sjsu.testinterfaces.FacultyInfo;
import com.sjsu.testinterfaces.PersonBean;
import com.sjsu.testinterfaces.StudentBean;
import com.sjsu.testinterfaces.StudentInfo;

public class TestInterfaces {

	StudentInfo studentInfo;
	FacultyInfo facultyInfo;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		studentInfo = new StudentInfo();
		studentInfo.setStudentList(new ArrayList<StudentBean>());

		facultyInfo = new FacultyInfo();
		facultyInfo.setFacultyList(new ArrayList<FacultyBean>());

	}

	@After
	public void tearDown() throws Exception {

		studentInfo = null;
		facultyInfo = null;

	}

	/*
	 * Test for addition of a record
	 */
	
	@Test
	public void testForRecordAddition() {

		PersonBean student = createStudentRecord();
		PersonBean faculty = createFacultyRecord();

		studentInfo.addNewRecord(student);
		facultyInfo.addNewRecord(faculty);

		Assert.assertEquals("Could not add student record successfully", new Integer(1),
				new Integer(studentInfo.getStudentList().size()));

		Assert.assertEquals("Could not add faculty record successfully", new Integer(1),
				new Integer(facultyInfo.getFacultyList().size()));

	}
	
	
	/*
	 * Test for record deletion
	 */
	
	@Test
	public void testForRecordDeletion() {

		createRecordsForTest();

		studentInfo.deleteRecord(111);
		Assert.assertEquals("Student record could not be deleted successfully", new Integer(0),
				new Integer(studentInfo.getStudentList().size()));

		facultyInfo.deleteRecord(222);
		Assert.assertEquals("Faculty record could not be deleted successfully", new Integer(0),
				new Integer(facultyInfo.getFacultyList().size()));
	}
	
	//Test for displaying a record
	
	@Test
	public void testRecordForDisplay(){
		createRecordsForTest();
		
		studentInfo.displayRecord(111);
		facultyInfo.displayRecord(222);
	}

	
	//----------------------Test Data Creation Methods -----------------------
	
	private void createRecordsForTest() {
		StudentBean student = (StudentBean) createStudentRecord();
		FacultyBean faculty = (FacultyBean) createFacultyRecord();

		studentInfo.getStudentList().add(student);
		facultyInfo.getFacultyList().add(faculty);

	}

	private PersonBean createStudentRecord() {

		StudentBean student = new StudentBean();

		student.setStudentId(new Integer(111));
		student.setFullName("Varsha");
		student.setAddress("San Jose");

		return student;
	}

	private PersonBean createFacultyRecord() {

		FacultyBean faculty = new FacultyBean();
		faculty.setFacultyId(222);
		faculty.setFullName("Ashley");
		faculty.setAddress("San Mateo");
		return faculty;
	}

}
