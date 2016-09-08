package com.sjsu.testgenerics;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestGenerics {

	StudentDatabase studentDb;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		studentDb = new StudentDatabase();
		studentDb.setStudentRecords(new ArrayList<StudentBean>());

	}

	@After
	public void tearDown() throws Exception {
		studentDb = null;
	}

	/**
	 * Test for checking if the student records could be added to ArrayList
	 * 
	 * @author Varsha Kankariya
	 */
	@Ignore
	@Test
	public void testAddStudentInfo() {
		StudentBean studentInfo = createStudentBean("111", "Varsha", "San Jose");
		studentDb.addStudentInfo(studentInfo);
		Assert.assertEquals("Could not add record to the list successfully", new Integer(1),
				new Integer(studentDb.getStudentRecords().size()));

	}

	/**
	 * Test for displaying all the student records
	 * @author Varsha Kankariya
	 */
	@Test
	
	public void testDisplayAllStudentRecords() {
		StudentBean studentInfo1 = createStudentBean("111", "Varsha", "San Jose");
		studentDb.getStudentRecords().add(studentInfo1);
		StudentBean studentInfo2 = createStudentBean("222", "Ashley", "San Mateo");
		studentDb.getStudentRecords().add(studentInfo2);
		
		studentDb.displayAllStudentRecords();
		Assert.assertEquals("Could not display records of the list successfully", new Integer(2),
				new Integer(studentDb.getStudentRecords().size()));

	}

	private StudentBean createStudentBean(String id, String name, String address) {

		StudentBean studentInfo = new StudentBean();
		studentInfo.setStudentId(id);
		studentInfo.setFullName(name);
		studentInfo.setAddress(address);
		return studentInfo;

	}
}
