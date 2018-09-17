package com.techprimers.jpa.springjpahibernateexample.model;

public class GroupTrailer {
	private String GroupControlTotal;
	private String NumberofAccounts;
	private String NumberofRecords; 
	private String EndGroupTrailer="/";
	public String getGroupControlTotal() {
		return GroupControlTotal;
	}
	public void setGroupControlTotal(String groupControlTotal) {
		GroupControlTotal = groupControlTotal;
	}
	public String getNumberofAccounts() {
		return NumberofAccounts;
	}
	public void setNumberofAccounts(String numberofAccounts) {
		NumberofAccounts = numberofAccounts;
	}
	public String getNumberofRecords() {
		return NumberofRecords;
	}
	public void setNumberofRecords(String numberofRecords) {
		NumberofRecords = numberofRecords;
	}
	public String getEndGroupTrailer() {
		return EndGroupTrailer;
	}
	public void setEndGroupTrailer(String endGroupTrailer) {
		EndGroupTrailer = endGroupTrailer;
	}
	

}
