package com.jancy.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentCollectionrunner {

	public static void main(String[] args) {
		/*List<Student> students=List.of(new Student(1,"Jancy"),
				new Student(50,"Janice"),
				new Student(3,"Jonathan"));*/
		
		
		ArrayList<Student> studentsAl=new ArrayList<Student>();
		Student s1=new Student(3,"Jon");
		studentsAl.add(s1);
		Student s2=new Student(100,"Jancy");
		studentsAl.add(s2);
		Student s3=new Student(1,"Janice");
		studentsAl.add(s3);
		
		System.out.println(studentsAl);
		
		
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
	}

}
