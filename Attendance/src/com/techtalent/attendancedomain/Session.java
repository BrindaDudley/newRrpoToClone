package com.techtalent.attendancedomain;

import java.util.ArrayList;
import java.util.List;

public class Session {
	private String sessionId;
	private List<Student> stud;
	private String date;

	public Session(String sid,int numStudent,String regnum,String sDate) {
		//to check is this stident is taged to this session;
		this.sessionId=sid;
		this.date=sDate;
		stud=new ArrayList<>();
		if(regnum.compareTo("3434")==0) {
		for(int i=0;i<numStudent;i++)
		{
			Student student=new Student();
			stud.add(student);
			student.setName("Brinda");
			student.setRegNum("3434");
			student.setPresent(true);
		}
		System.out.println("the attendace marked.");
		}
		else {
			System.out.println("not a valid student");
		}

	}

}
