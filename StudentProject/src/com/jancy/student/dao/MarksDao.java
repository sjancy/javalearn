package com.jancy.student.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.jancy.mark.model.Marks;

public class MarksDao {
	
	public ArrayList<Marks> selectMark(Integer studentID) {
		ArrayList<Marks> markList = new ArrayList<>();
		Connection con=null;
		Statement stmt=null;
		try {
			con=DBConnection.getConnection();
			stmt=con.createStatement();
			String selectquery="select markID,studentID,Semester,Year,Subject,marks from mark where studentID="+studentID;
			System.out.println("execute select query:"+selectquery);
			ResultSet rs=stmt.executeQuery(selectquery);
			
			while(rs.next()) {
				Marks marks=new Marks();
				Integer markId=rs.getInt("markID");
				Integer StudentID=rs.getInt("studentID");
				String SEMESTER=rs.getString("Semester");
				Integer YEAR=rs.getInt("Year");
				String SUBJECT=rs.getString("Subject");
				Integer Marks=rs.getInt("marks");
				
				
				marks.setMarkID(markId);
				marks.setStudentID(StudentID);
				marks.setSemester(SEMESTER);
				marks.setYear(YEAR);
				marks.setSubject(SUBJECT);
				marks.setMarks(Marks);
				
				
				markList.add(marks);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
			DBConnection.closeStatement(stmt);
		}
		return markList;
	}
	
	
	
	public ArrayList<Marks> selectSemesterList(String semester) {
		ArrayList<Marks> markList = new ArrayList<>();
		Connection con=null;
		Statement stmt=null;
		try {
			con=DBConnection.getConnection();
			stmt=con.createStatement();
			String selectsemquery="select markID,studentID,Semester,Year,Subject,marks from mark where Semester='"+semester+"'";
			System.out.println("execute select query:"+selectsemquery);
			ResultSet rs=stmt.executeQuery(selectsemquery);
			
			while(rs.next()) {
				Marks marks=new Marks();
				Integer markId=rs.getInt("markID");
				Integer StudentID=rs.getInt("studentID");
				String Semester=rs.getString("Semester");
				Integer yesr=rs.getInt("Year");
				String subject=rs.getString("Subject");
				Integer mark=rs.getInt("marks");
				
				
				marks.setMarkID(markId);
				marks.setStudentID(StudentID);
				marks.setSemester(Semester);
				marks.setYear(yesr);
				marks.setSubject(subject);
				marks.setMarks(mark);
				
				
				markList.add(marks);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
			DBConnection.closeStatement(stmt);
		}
		return markList;
	}

}
