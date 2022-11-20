package com.jancy.Array;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks=new ArrayList<Integer>();//  beacuse we are going to add and reamove student marak from the element

	public Student(String name, int... marks) {
		this.name=name;
		for(int mark:marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {

		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum=0;
		for(int mark:marks) {
			sum=sum+mark;
		}
		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
		/*int maximum=Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark>maximum) {
				maximum=mark;
			}
		}
		return maximum;*/
	}

	public int getMinimumMark() { 
		return Collections.min(marks);
		/*		int minimum=Integer.MAX_VALUE; //99,90,100
				for(int mark:marks) {
					if(mark<minimum) {
						minimum=mark;
					}
				}
				return minimum;*/
	}

	public BigDecimal getAverageMarks() {
		int sum=getTotalSumOfMarks();
		int total=getNumberOfMarks();
		
		return new BigDecimal(sum).divide(new BigDecimal(total),3,RoundingMode.UP);
	}
	
	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
		
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
		
	}
	

}
