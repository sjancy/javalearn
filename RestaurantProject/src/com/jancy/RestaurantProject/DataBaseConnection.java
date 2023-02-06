package com.jancy.RestaurantProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {

	public static Connection getConnection() throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy3","root","jerin");
		return con;
	}
	
	public static void closeStatement(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public static void closeConnection(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	
}
