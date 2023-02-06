package com.jancy.RestaurantProject;

public class FoodList {
	
   private Integer menu_Id;
   private String menu_list;
   private double cost;
   private Integer count;
   
   
public Integer getMenu_Id() {
	return menu_Id;
}
public void setMenu_Id(Integer menu_Id) {
	this.menu_Id = menu_Id;
}
public String getMenu_list() {
	return menu_list;
}
public void setMenu_list(String menu_list) {
	this.menu_list = menu_list;
}
public double getCost() {
	return cost;
}
public void setCost(double cost) {
	this.cost = cost;
}
public Integer getCount() {
	return count;
}
public void setCount(Integer count) {
	this.count = count;
}


@Override
public String toString() {
	return "FoodList [menu_Id=" + menu_Id + ", menu_list=" + menu_list + ", cost=" + cost + ", count=" + count + "]";
}
   
   
   
}
   