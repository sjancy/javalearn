import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks=new ArrayList<Integer>();

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
		int totalsum=0;
		for(int mark:marks) {
			totalsum=totalsum+mark;
			
		}
		return totalsum;
	}

	public int getMaximumMark() {
		/*int maximum=Integer.MIN_VALUE;
		for(int mark:marks) {
			if(mark>maximum) {
				maximum=mark;
			}
		}
		
		return maximum;*/
		//0r
	   return Collections.max(marks);
	}

	public int getminimumMark() {
		/*		int minimum=Integer.MAX_VALUE;
				for(int mark:marks) {
					if(mark<minimum) {
						minimum=mark;
					}
				}
				
				return minimum;*/
		
		return Collections.min(marks);
	}

	public BigDecimal getAverageMarks() {
		int sum= getTotalSumOfMarks();
		int number=getNumberOfMarks();
		return new BigDecimal(sum/number);
	}
	
	public String toString() {
		return name+marks;
	}

	public void getNewMark(int mark) {
		marks.add(mark);
		
	}

	public void removeMarksIndexAt(int index) {
		marks.remove(index);
		
	}

}
