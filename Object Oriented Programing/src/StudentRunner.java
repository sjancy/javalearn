
public class StudentRunner {

	public static void main(String[] args) {
		//Student student=new Student();
		
		//student.setName("Jancy");
		//student.setCollegename("hhghg");
		//student.setYear(2009);
		//System.out.println(student);
		
		/*Person person=new Person();
		person.setName("jancy");
		person.setEmail("jancy@gmail.com");
		person.setPhoneno("123-456-7896");
		String value=person.toString();
		System.out.println(value);
		System.out.println(person);*/
		
		
		Employee employee=new Employee("jancy", "Programmer Analyst");
		//employee.setName("jancy");
		employee.setEmail("jancy@gmail.com");
		employee.setPhoneno("123-456-7896");
		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		
		System.out.println(employee);
	}

}
