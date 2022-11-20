
public class Student extends Person {

	
	private String Collegename;
	private int year;
	public String getCollegename() {
		return Collegename;
	}
	
	
	public Student (String name, String collegename) {
		super(name);
		this.Collegename=collegename;
	}
	public void setCollegename(String collegename) {
		Collegename = collegename;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	public String toString() {
		return String.format("collegename- %s,  year- %d", Collegename,year);
	}
	
}
