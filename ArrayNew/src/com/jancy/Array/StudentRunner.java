package com.jancy.Array;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		
		
		Student student=new Student("Jancy",99,90,100);
		
		int number=student.getNumberOfMarks();
        System.out.println("Number of marks:" + number);
        
        
        int sum=student.getTotalSumOfMarks();
        System.out.println("Sum of marks:" + sum);
        
        int maximun=student.getMaximumMark();
        System.out.println("Maximum of marks:" + maximun);
        
        int minimun=student.getMinimumMark();
        System.out.println("Minimum of marks:" + minimun);
        
        BigDecimal average=student.getAverageMarks();
        System.out.println("Average:" + average);
        
        System.out.println(student);//to get the value we are tostring method
        
        student.addNewMark(78);
        
        System.out.println(student);
        
        student.removeMarkAtIndex(1);
        
        System.out.println(student);
	}

}
