package com.sjsu.testcollections;

import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestStudentRecord {

	StudentRecords studentRecords;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		studentRecords = new StudentRecords();
		studentRecords.setStudentRecords(new HashMap<String, StudentBean>());

	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test for adding student records to HashMap
	 * 
	 * @author Varsha Kankariya
	 */
	@Test
	
	public void testAddStudentRecord() {

		StudentBean studentInfo = createStudentBean("111", "Varsha", "San Jose");
		studentRecords.addStudentRecord(studentInfo);

		Assert.assertEquals("Could not add student record to the map!!!!", new Integer(1),
				new Integer(studentRecords.getStudentRecords().size()));

	}

	/**
	 * Test for displaying student records from HashMap based on the studentId
	 * that is used as key
	 * 
	 * @author Varsha Kankariya
	 */
	@Test
	
	public void testDisplayStudentRecord() {
		StudentBean studentInfo1 = createStudentBean("111", "Varsha", "San Jose");
		studentRecords.getStudentRecords().put(studentInfo1.getStudentId(), studentInfo1);
		StudentBean studentInfo2 = createStudentBean("222", "Ashley", "San Mateo");
		studentRecords.getStudentRecords().put(studentInfo2.getStudentId(), studentInfo2);

		studentRecords.displayStudentRecord(studentInfo2.getStudentId());

		Assert.assertEquals("Could not display student record successfully!!!!", new Integer(2),
				new Integer(studentRecords.getStudentRecords().size()));

	}

	/**
	 * Test for removing student records from HashMap based on the studentId
	 * that is used as key.
	 * 
	 * @author Varsha Kankariya
	 */
	
	@Test
	public void testRemoveStudentRecord() {
		StudentBean studentInfo1 = createStudentBean("111", "Varsha", "San Jose");
		studentRecords.getStudentRecords().put(studentInfo1.getStudentId(), studentInfo1);
		StudentBean studentInfo2 = createStudentBean("222", "Ashley", "San Mateo");
		studentRecords.getStudentRecords().put(studentInfo2.getStudentId(), studentInfo2);

		StudentBean studentInfo = studentRecords.removeStudentRecord(studentInfo2.getStudentId());

		Assert.assertEquals("Could not remove student record successfully!!!!", new Integer(1),
				new Integer(studentRecords.getStudentRecords().size()));

		Assert.assertEquals("Could not remove student record successfully!!!!", studentInfo2.getFullName(),
				studentInfo.getFullName());
	}

	private StudentBean createStudentBean(String id, String name, String address) {

		StudentBean studentInfo = new StudentBean();
		studentInfo.setStudentId(id);
		studentInfo.setFullName(name);
		studentInfo.setAddress(address);
		return studentInfo;

	}

}
