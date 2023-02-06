package com.jancy.student.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.jancy.mark.model.Marks;
import com.jancy.student.dao.MarksDao;
import com.jancy.student.dao.StudentDao;
import com.jancy.student.nodel.Student;

public class StudentService {
	
	private Scanner sc=new Scanner(System.in);
	
	StudentDao studentdao=new StudentDao();
	MarksDao marksdao=new MarksDao();
	
	public Student getStudent() {
		System.out.println("Enter the studentID");
		int studentID=sc.nextInt();
		
		Student student=new Student();
		student.setSutdentID(studentID);
		student=studentdao.selectStudent(studentID);
		
		System.out.println("studentID" +"\t\t"+ "name" +"\t\t"+ "age" +"\t\t"+ "address");
		Integer ID=student.getSutdentID();
		String displyname=student.getName();
		Integer age=student.getAge();
		String address=student.getAddress();
		System.out.printf("%5d%23s%14d%29s\n",ID,displyname,age,address);
		System.out.println(student);
		
		
		return student;
	}
	
	public ArrayList<Marks> getMark() {
		System.out.println("Enter the studentID");
		int studentID=sc.nextInt();
		
		ArrayList<Marks> mark=new ArrayList<>();
    	mark=marksdao.selectMark(studentID);
    	System.out.println("markID" +"\t\t"+ "studentID" +"\t\t"+ "Semester" +"\t\t"+ "Year" +"\t"+ "Subject" +"\t\t\t"+ "marks");
        System.out.println("=====================================================================================================");
    	for(Marks marklist : mark) {
    	Integer mID=marklist.getMarkID();
    	Integer sID=marklist.getStudentID();
    	String Semester=marklist.getSemester();
    	Integer Year=marklist.getYear();
    	String Subject=marklist.getSubject();
    	Integer marks=marklist.getMarks();
    	System.out.printf("%4d%15d%27s%22d\t%-15s%12d\n",mID,sID,Semester,Year,Subject,marks);
    	}
    	int sum=0;
    	float average=0;
    	int averagemarklist=0;
    	
    	for(Marks list:mark) {
      averagemarklist=list.getMarks();
    	sum+=averagemarklist;
      	}
    	average=sum/mark.size();
    	System.out.println("Sum of the student Mark:" +sum);
    	System.out.println("Average of the student Mark:"+average);
 		return mark;

	}
	
	public ArrayList<Marks> getSemesterYear(){
		
		System.out.println("Enter the Semester");
		String semester=sc.next();
	    System.out.println("Enter the Year");
		Integer year=sc.nextInt();
	
		
		ArrayList<Marks> semesteryear=new ArrayList<>();
		semesteryear=marksdao.selectSemesterList(semester);
	   	System.out.println("markID" +"\t\t"+ "studentID" +"\t\t"+ "Semester" +"\t\t"+ "Year" +"\t"+ "Subject" +"\t\t\t"+ "marks");
        System.out.println("=====================================================================================================");
    	for(Marks marklist : semesteryear) {
    	Integer mID=marklist.getMarkID();
    	Integer sID=marklist.getStudentID();
    	String Semester=marklist.getSemester();
    	Integer Year=marklist.getYear();
    	String Subject=marklist.getSubject();
    	Integer marks=marklist.getMarks();
    	System.out.printf("%4d%15d%27s%22d\t%-15s%12d\n",mID,sID,Semester,Year,Subject,marks);
    	}
		return semesteryear;
				
	}
	
	

}
