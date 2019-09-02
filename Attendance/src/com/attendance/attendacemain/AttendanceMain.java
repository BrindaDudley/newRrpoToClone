package com.attendance.attendacemain;

import java.util.Scanner;

import com.techtalent.attendancedomain.Session;

public class AttendanceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please provide the session ID");
		String sessionID=scanner.nextLine();
		System.out.println("plseae provide the student regstriation number");
		String regNum=scanner.nextLine();
		Session seeion1=new Session(sessionID,5,regNum,"02/11/19");

	}

}
