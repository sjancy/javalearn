import java.math.BigDecimal;
import java.util.jar.Attributes.Name;

public class StudentRunner {

	public static void main(String[] args) {
		Student student=new Student("Jancy", 99,100,98);
         int number=student.getNumberOfMarks();
          System.out.println("number of marks:" +number);
          
          int sum=student.getTotalSumOfMarks();
          System.out.println("sum of total marks:" +sum);
          
          int maximumMark=student.getMaximumMark();
          System.out.println("Maximum number:" +maximumMark);
          
          int minimumMark=student.getminimumMark();
          System.out.println("Maximum number:" +minimumMark);
          
          BigDecimal average=student.getAverageMarks();
          System.out.println("Average:"+average);
          
          System.out.println(student);
          
          student.getNewMark(79);
          System.out.println(student);
          
          student.removeMarksIndexAt(1);
          System.out.println(student);
	}

}
