package com.sjsu.testqueues;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCourseWaitList {

	CourseWaitlist courseWaitList;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		courseWaitList = new CourseWaitlist();
		courseWaitList.setCourseWaitList(new LinkedList<String>());
	}

	@After
	public void tearDown() throws Exception {

		courseWaitList = null;

	}

	
	/**
	 * Test for checking if students can be added successfully to the waitlist
	 * 
	 * @author Varsha Kankariya
	 */
	
	@Test
	public void testAddStudentToWaitlist() {

		courseWaitList.addStudentToWaitlist("111");
		Assert.assertEquals("Student not added successfully", new Integer(1),
				new Integer(courseWaitList.getCourseWaitList().size()));

	}

	
	/**
	 * Test for checking if students can be removed successfully from the waitlist
	 * 
	 * @author Varsha Kankariya
	 */
	
	@Test
	public void testRemoveStudentFromWaitlist() {
		courseWaitList.getCourseWaitList().add("111");
		courseWaitList.removeStudentFromWaitlist();
		Assert.assertEquals("Student not removed successfully", new Integer(0),
				new Integer(courseWaitList.getCourseWaitList().size()));
	}

	/**
	 * Test for checking if student in front of the list can be displayed successfully
	 * 
	 * @author Varsha Kankariya
	 */
	
	@Test
	public void testDisplayFirstStudentInWaitList() {
		courseWaitList.getCourseWaitList().add("111");
		courseWaitList.getCourseWaitList().add("222");
		courseWaitList.getCourseWaitList().add("333");

		courseWaitList.displayFirstStudentInWaitList();
		Assert.assertEquals("Student removed instead of just displaying the details", new Integer(3),
				new Integer(courseWaitList.getCourseWaitList().size()));
	}

	/**
	 * Test fro checking if the course waitlist can be emptied successfully
	 * @author Varsha Kankariya
	 */
	
	@Test
	public void testEmptyWaitList() {
		courseWaitList.getCourseWaitList().add("111");
		courseWaitList.getCourseWaitList().add("222");
		courseWaitList.getCourseWaitList().add("333");

		courseWaitList.emptyWaitList();
		
		Assert.assertEquals("List not emptied successfully!!", new Integer(0),
				new Integer(courseWaitList.getCourseWaitList().size()));

	}

}
