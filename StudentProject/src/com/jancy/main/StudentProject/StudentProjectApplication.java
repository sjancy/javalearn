package com.jancy.main.StudentProject;

import java.util.ArrayList;
import java.util.Scanner;

import com.jancy.mark.model.Marks;
import com.jancy.student.nodel.Student;
import com.jancy.student.service.StudentService;

public class StudentProjectApplication {
	
	private Scanner sc = new Scanner(System.in);
	
	private StudentService studentservice=new StudentService();
	
	private ArrayList<Marks> studentmarklist=new ArrayList<>();
	private ArrayList<Student> studentlist=new ArrayList<>();
	
	public static void main(String[] args) {
		
		StudentProjectApplication studentprojectapplication=new StudentProjectApplication();
		
		studentprojectapplication.ProcessMailMenu();
	}

	private void ProcessMailMenu() {
		boolean exitMenu = false;
		while (true) {
			System.out.println("##################");
			System.out.println("##  Main Menu  ##");
			System.out.println("##################");
			System.out.println("Enter your choice:");
			System.out.println("1.Student Details");
			System.out.println("2.Mark Details");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			int Option = sc.nextInt();

			switch (Option) {
			case 1:
				StudentDetails();
			
		case 4:
			exitMenu = true;
			break;
		default:
			System.out.println("Invalid main menu option.  Please try again.");
		}

		if (exitMenu) {
			System.out.println("Exiting Application.");
			break;
		}
	}
	}


private void StudentDetails() {
	
	boolean exitMenu = false;
	while (true) {
		System.out.println("#####################");
		System.out.println("##  Student Details  ##");
		System.out.println("#####################");
		System.out.println("1. View Student");
		System.out.println("2. Add Student");
		System.out.println("3. Update Student");
		System.out.println("4. Delete Student");
		System.out.println("5. Return to Main Menu");
		System.out.println("Enter your choice:");
		int Option = sc.nextInt();

		switch (Option) {
		case 1:
			getStudentDetails();
			break;
		case 5:
			exitMenu = true;
			break;
		default:
			System.out.println("Invalid customer menu option.  Please try again.");
		}

		if (exitMenu) {
			break;
		}
	}

}

private void getStudentDetails() {
	Student studentdetails=studentservice.getStudent();
	ArrayList<Marks> markdetails=studentservice.getMark();
	ArrayList<Marks> semesterdetails=studentservice.getSemesterYear();
	
	studentlist.add(studentdetails);
	studentmarklist.addAll(markdetails);
	studentmarklist.addAll(semesterdetails);
	
}
}

