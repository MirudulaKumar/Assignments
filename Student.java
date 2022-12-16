package org.student;

import org.college.College;

public class Student extends College {
	
	public void studentName() {
		System.out.println("Student Name: Mirudula Kumar");
	}
	public void studentDept() {
		System.out.println("Student Dept: EEE");
	}
	public void studentId() {
		System.out.println("Student ID: 27");
	}

	public static void main(String[] args) {
		  
		Student obj = new Student();
		obj.collegeCode();
		obj.collegename();
		obj.collegeRank();
		obj.departmentname();
		obj.studentName();
		obj.studentDept();
		obj.studentId();
		
		

	}

}
