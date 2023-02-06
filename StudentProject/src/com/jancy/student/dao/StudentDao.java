package com.jancy.student.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jancy.student.nodel.Student;

public class StudentDao {
	
	public void createStudent(Student student) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DBConnection.getConnection();
			String insertQuery="insert into values("+student.getSutdentID()+", "+student.getName()+","+student.getAge()+","+student.getAddress()+")";
			System.out.println("execute insert query:" +insertQuery);
			stmt=con.createStatement();
			stmt.execute(insertQuery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
			DBConnection.closeStatement(stmt);
		}
	}
	
	
	public Student selectStudent(Integer studentID) {
		Student student=null;
		Connection con=null;
		Statement stmt=null;
		
		try {
			con=DBConnection.getConnection();
			stmt=con.createStatement();
			String selectquery="select studentID,name,age,address from student where studentID="+studentID;
			System.out.println("execute selectquery:" +selectquery);
			
			ResultSet rs=stmt.executeQuery(selectquery);
			student=new Student();
			
			if(rs.next()) {
				Integer student_ID=rs.getInt("studentID");
				String Name=rs.getString("name");
				Integer Age=rs.getInt("age");
				String Address=rs.getString("address");
				
				student.setSutdentID(student_ID);
				student.setName(Name);
				student.setAge(Age);
				student.setAddress(Address);
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
			DBConnection.closeStatement(stmt);
		}
		return student;
		
	}
	
	public void updateStudent(Student student) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DBConnection.getConnection();
			stmt=con.createStatement();
			String updatequery="update student set name="+student.getName()+",age="+student.getAge()+",address="+student.getAddress()+" where STUDENT_ID="+student.getSutdentID(); 
			System.out.println("updateQuery:"+updatequery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnection.closeConnection(con);
			DBConnection.closeStatement(stmt);
		}
		
	}

}
