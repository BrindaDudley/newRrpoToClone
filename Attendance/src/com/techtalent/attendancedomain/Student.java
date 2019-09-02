package com.techtalent.attendancedomain;

public class Student {
	private boolean present;
	private String regNum;
	private String name;
	private Session session;
	public boolean isPresent() {
		return present;
	}
	public void setPresent(boolean present) {
		
		this.present = present;
	}
	public String getRegNum() {
		return regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
