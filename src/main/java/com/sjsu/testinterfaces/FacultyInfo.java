package com.sjsu.testinterfaces;

import java.util.ArrayList;

/**
 * Defines all the operations that can be performed on 'FacultyBean'. Implements
 * the interface {@link PersonInfo}
 * 
 * @author Varsha Kankariya
 *
 */
public class FacultyInfo implements PersonInfo {

	public FacultyInfo() {

	}

	// List to maintain all the records of faculty
	private ArrayList<FacultyBean> facultyList;

	/**
	 * @return the facultyList
	 */
	public ArrayList<FacultyBean> getFacultyList() {
		return facultyList;
	}

	/**
	 * @param facultyList
	 *            the facultyList to set
	 */
	public void setFacultyList(ArrayList<FacultyBean> facultyList) {
		this.facultyList = facultyList;
	}

	/**
	 * Adds new record to {@code facultyList}. The details of the faculty are
	 * passed as a parameter {@code personInfo} to the method which is then
	 * added to arraylist.
	 */
	@Override
	public void addNewRecord(PersonBean personInfo) {

		FacultyBean facultyInfo = (FacultyBean) personInfo;
		facultyList.add(facultyInfo);
		System.out.println("Added New Record!!!");

	}

	/**
	 * Deletes a faculty record with the given faculytId.
	 */
	@Override
	public void deleteRecord(int Id) {

		// Flag indicating if the record was deleted successfully
		boolean isDeleted = false;

		// Check if the list is empty or not
		if (!facultyList.isEmpty()) {
			// Traverse through the records list
			for (FacultyBean facultyInfo : facultyList) {
				// If the record is found
				if (facultyInfo.getFacultyId().intValue() == Id) {
					// Remove the record
					facultyList.remove(facultyInfo);
					// Mark the flag to indicate successful deletion
					isDeleted = true;
					break;
				}
			}

			if (isDeleted) {
				System.out.println("Faculty record deleted!!");
			} else {
				System.out.println("No faculty record with given ID!!");
			}
		}
		// If the record list is empty,display the message to the user.
		else {
			System.out.println("Faculty List is empty");
		}

	}

	/**
	 * Displays a faculty record to the user with the given faculty Id
	 */
	@Override
	public void displayRecord(int Id) {
		// Check if the record list is empty
		if (!facultyList.isEmpty()) {
			// Traverse through the list
			for (FacultyBean facultyInfo : facultyList) {
				// If the record is found, display the details to the user
				if (facultyInfo.getFacultyId().intValue() == Id) {
					System.out.println("Id : " + facultyInfo.getFacultyId());
					System.out.println("Name : " + facultyInfo.getFullName());
					System.out.println("Address : " + facultyInfo.getAddress());
				}
			}

		}
		// If the record list is empty,display the message to the user.
		else {
			System.out.println("Faculty List is empty");
		}

	}

}
