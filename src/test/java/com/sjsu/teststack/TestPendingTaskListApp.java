package com.sjsu.teststack;

import java.util.Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPendingTaskListApp {

	PendingTaskListApp pendingTaskListApp;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		pendingTaskListApp = new PendingTaskListApp();
		pendingTaskListApp.setPendingTaskList(new Stack<String>());
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test for checking if the tasks are added successfully to the stack
	 * 
	 * @author Varsha Kankariya
	 */

	@Test
	public void testAddPendingTask() {
		pendingTaskListApp.addPendingTask("Submit college payment");
		Assert.assertEquals("Could not add pending task to the list successfully", new Integer(1),
				new Integer(pendingTaskListApp.getPendingTaskList().size()));
	}

	/**
	 * Test for checking if the tasks are removed successfully from the stack
	 * 
	 * @author Varsha Kankariya
	 */

	@Test
	public void testRemoveLatestPendingTask() {
		pendingTaskListApp.getPendingTaskList().add("Submit college payment");
		pendingTaskListApp.getPendingTaskList().add("Get grocery");

		String pendingTaskDtls = pendingTaskListApp.removeLatestPendingTask();

		Assert.assertEquals("Pending Task not removed successfully", new Integer(1),
				new Integer(pendingTaskListApp.getPendingTaskList().size()));

		Assert.assertEquals("Pending Task not removed successfully", pendingTaskDtls, "Get grocery");

	}

	/**
	 * Test for checking if the latest tasks is displayed successfully from the
	 * stack
	 * 
	 * @author Varsha Kankariya
	 */

	@Test
	public void testDisplayLatestPendingTask() {

		pendingTaskListApp.getPendingTaskList().add("Submit college payment");
		pendingTaskListApp.getPendingTaskList().add("Get grocery");

		pendingTaskListApp.displayLatestPendingTask();

		Assert.assertEquals("Could not display latest pending task successfully", new Integer(2),
				new Integer(pendingTaskListApp.getPendingTaskList().size()));

	}

}
