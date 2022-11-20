package com.jancy.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		//Student student=new Student();
		
		//student.setName("Jancy");
		//student.setEmail("jancy@gmail.com");
		
		/*Person person=new Person();
		person.setName("Jancy");
		person.setEmail("jancy@gamil.com");
		person.setPhoneNo("123-456-7890");
		String value=person.toString();
		System.out.println(value);
		System.out.println(person);*/
        
        Employee employee=new Employee("Jancy", "Developer");
        //employee.setName("Jancy");
        employee.setEmail("jancy@gamil.com");
        employee.setPhoneNo("123-456-7890");
        employee.setEmployeeGrade('A');
        employee.setTitle("Developer");

        System.out.println(employee);
        
	}

}
