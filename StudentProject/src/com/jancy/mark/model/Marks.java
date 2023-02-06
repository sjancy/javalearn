package com.jancy.mark.model;

public class Marks {
	private Integer markID;
	private Integer studentID;
	private String Semester;
	private Integer Year;
	private String Subject;
	private Integer marks;
	
	
	public Integer getMarkID() {
		return markID;
	}
	public void setMarkID(Integer markID) {
		this.markID = markID;
	}
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public String getSemester() {
		return Semester;
	}
	public void setSemester(String semester) {
		Semester = semester;
	}
	public Integer getYear() {
		return Year;
	}
	public void setYear(Integer year) {
		Year = year;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "Marks [markID=" + markID + ", studentID=" + studentID + ", Semester=" + Semester + ", Year=" + Year
				+ ", Subject=" + Subject + ", marks=" + marks + "]";
	}
	

	

}
