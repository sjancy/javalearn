package collections;

import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {
     
	List<Student> students = List.of(new Student(1, "Jancy"), new Student(2, "Sam"), new Student(3, "Mercy"));
         System.out.println(students);
     
	}

}
