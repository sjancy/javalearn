package com.jancy.RestaurantProject;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FoodProcessDao {
	
	public FoodList getfoodlist(Integer menu_Id) {
		Connection con=null;
		Statement stmt=null;
		FoodList food=null;
		
		try {
			con=DataBaseConnection.getConnection();
			stmt=con.createStatement();
			String getfoodgetails="select Menu_Id,menu_list,cost,count from Food where Menu_ID=" +menu_Id;
			System.out.println("GetFoodDetails:"+ getfoodgetails);
			ResultSet rs=stmt.executeQuery(getfoodgetails);
			food=new FoodList();
			if(rs.next()) {
				
				//Integer menu_id=rs.se
				String menulist=rs.getString("menu_list");
				Double cost=rs.getDouble("cost");
				Integer count=rs.getInt("count")
;				
				food.setMenu_Id(menu_Id);
				food.setMenu_list(menulist);
				food.setCost(cost);
				food.setCount(count);
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseConnection.closeConnection(con);
			DataBaseConnection.closeStatement(stmt);
		}
		
		return food;
		
	}
	
	
	public FoodList updatefoodlist(FoodList foodlist) {
			Connection con=null;
			Statement stmt=null;
			
			try {
				con=DataBaseConnection.getConnection();
				stmt=con.createStatement();
				
				String updatefooddetails="update Food set menu_list='"+foodlist.getMenu_list()+"', count="+foodlist.getCount()+" where Menu_ID="+foodlist.getMenu_Id();
				System.out.println("execute updatequery:" +updatefooddetails);
				stmt.execute(updatefooddetails);
			}catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DataBaseConnection.closeConnection(con);
				DataBaseConnection.closeStatement(stmt);
			}
			
      return foodlist;
		
	}

}
