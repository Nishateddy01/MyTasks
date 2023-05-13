package org.student;

import org.department.Department;

public class Student extends Department{
	//--------------Assignment 2: multilevel inheritance-------------------//
	public void studentName() 
	{
		System.out.println("studentName from Student");
	}
	public void studentDept() 
	{
		System.out.println("studentDept from Student");
	}
	public void studentId() 
	{
		System.out.println("studentId from Student");
	}
	public static void main(String[] args) {
		Student st = new Student();
		st.collegeCode();
		st.collegeName();
		st.collegeRank();
		System.out.println("--------------------------");
		st.deptName();
		System.out.println("--------------------------");
		st.studentId();
		st.studentName();
		st.studentDept();
		
	}

}
