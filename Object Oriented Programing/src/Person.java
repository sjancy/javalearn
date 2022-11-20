
public class Person {
	
private String name;
private String email;
private String phoneno;

public Person(String name) {
	this.name=name;
	System.out.println("Person Constructed");
}

//constructor(now person has constructor with name)

	/*public Person(String name) {
		super();
		this.name = name;
	}
	*/


public String getName() {
	return name;
}


public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}


public String toString() {
	return name + "#" +email + "#" +phoneno;
}
	
}
