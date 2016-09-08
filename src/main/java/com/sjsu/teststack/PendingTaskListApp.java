package com.sjsu.teststack;

import java.util.Stack;

/**
 * Class helps in managing the pending tasks of the user which are worked on
 * based on their entry point. The latest task added is the first one to be
 * shown to the user where the user can view it, complete it and remove it from
 * his/her list.
 * 
 * @author Varsha Kankariya
 */
public class PendingTaskListApp {
	
	
	private Stack<String> pendingTaskList ;
	
	
	/**
	 * @return the pendingTaskList
	 */
	public Stack<String> getPendingTaskList() {
		return pendingTaskList;
	}

	/**
	 * @param pendingTaskList the pendingTaskList to set
	 */
	public void setPendingTaskList(Stack<String> pendingTaskList) {
		this.pendingTaskList = pendingTaskList;
	}

	public PendingTaskListApp() {

	}

	/**
	 * Adds pending task to the stack which will be the first one to be worked on
	 * 
	 * @author Varsha Kankariya
	 */

	public void addPendingTask(String pendingTaskDtls) {
		
		pendingTaskList.push(pendingTaskDtls);
		System.out.println("Pending Task Added to the List!!!");
		
	}

	/**
	 * Removes the pending task from the list, which is the most current one, on completion 
	 * @author Varsha Kankariya
	 * @return String : pending task details
	 */
	public String removeLatestPendingTask() {

		String pendingTaskDtls = null;
		if(!pendingTaskList.empty()){
			
			pendingTaskDtls = pendingTaskList.pop();
			System.out.println("The Latest Pending Task Completed : "+ pendingTaskDtls);
		}else{
			System.out.println("There is no pending task remaining!!!");
		}
		return pendingTaskDtls;
	}

	/**
	 * Displays the latest pending task details that are to be completed
	 * @author Varsha Kankariya
	 */
	public void displayLatestPendingTask() {
		

		String pendingTaskDtls = null;
		if(!pendingTaskList.empty()){
			
			pendingTaskDtls = pendingTaskList.peek();
			System.out.println("The Latest Pending Task : "+ pendingTaskDtls);
		}else{
			System.out.println("There is no pending task remaining!!!");
		}

	}

}
