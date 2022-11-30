package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub

		System.out.println("Student Name");
	}
	
	public void studentDept() {
		// TODO Auto-generated method stub

		System.out.println("Student Department");
	}
	
	public void studentId() {
		// TODO Auto-generated method stub

		System.out.println("Student Id");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj1 = new Student();
		
		obj1.collegeName();
		obj1.collegeCode();
		obj1.collegeRank();
		obj1.deptName();
		obj1.studentName();
		obj1.studentDept();
		obj1.studentId();
	}

}
