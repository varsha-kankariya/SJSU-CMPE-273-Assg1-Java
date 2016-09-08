package com.sjsu.multithreading;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestMultiThreading {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test to check the successful scenario, where all the students get
	 * enrolled into the course
	 * 
	 * @author Varsha Kankariya
	 */
	@Test
	@Ignore
	public void testForSuccessfulScenario() {

		// Create a new instance of the job for the threads
		StudentRecordJob job = new StudentRecordJob();

		// -------Create threads(students) and assign them the job of enrolling
		// into the course
		Thread student1 = new Thread(job);
		student1.setName("Varsha");

		Thread student2 = new Thread(job);
		student2.setName("Ashley");

		Thread student3 = new Thread(job);
		student3.setName("Sally");

		Thread student4 = new Thread(job);
		student4.setName("Catherine");

		// ----Start the threads----
		student1.start();
		student2.start();
		student3.start();
		student4.start();

	}

	/**
	 * Test to check failure scenario, where few students get enrolled and few
	 * don't because of the capacity of the class
	 * 
	 * @author Varsha Kankariya
	 */
	@Test
	
	public void testForFailureScenario() {

		// Create a new instance of the job for the threads
		StudentRecordJob job = new StudentRecordJob();

		// -------Create threads(students) and assign them the job of enrolling
		// into the course
		Thread student1 = new Thread(job);
		student1.setName("Varsha");

		Thread student2 = new Thread(job);
		student2.setName("Ashley");

		Thread student3 = new Thread(job);
		student3.setName("Sally");

		Thread student4 = new Thread(job);
		student4.setName("Catherine");

		Thread student5 = new Thread(job);
		student4.setName("Amy");

		// ----Start the threads----
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5.start();

	}

}
