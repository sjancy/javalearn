package com.jancy.RestaurantProject;

import java.util.Scanner;

public class FoodService {
	
	Scanner sc=new Scanner(System.in);
	FoodProcessDao foodprocessdao=new FoodProcessDao();
	
	public FoodList selectfoodlist() {
		
		System.out.println("Enter the MenuId");
		Integer menu_Id=sc.nextInt();
		System.out.println("How many burger do you want?");
		Integer orderedBurgerCount=sc.nextInt();
		
		FoodList list=new FoodList();
		list.setMenu_Id(menu_Id);
		list=foodprocessdao.getfoodlist(menu_Id);
		System.out.println(list);

		Integer availableBurgerCount=list.getCount();
		
		double availableBurgerCost=list.getCost();
		
		if(orderedBurgerCount<availableBurgerCount) {
			
			Integer newAvailableCount = availableBurgerCount-orderedBurgerCount;
			double finalCost=availableBurgerCost*orderedBurgerCount;
			list.setCost(finalCost);
			list.setCount(newAvailableCount);
			foodprocessdao.updatefoodlist(list);
		}else {
			System.out.println("insufficient count.");
		}
		
		System.out.println("Here is your bill:");
		System.out.println("MenuId:" +list.getMenu_Id());
		System.out.println("Food:"+list.getMenu_list());
		System.out.println("Price:" +list.getCost());
		return list;
	}

	

	public FoodList frenchfrieslist() {
		
		System.out.println("Enter the MenuId");
		Integer menu_Id=sc.nextInt();
		System.out.println("How many frenchfries bag you want?");
		Integer orderedFriesCount=sc.nextInt();
		
		FoodList list1=new FoodList();
		list1.setMenu_Id(menu_Id);
		list1=foodprocessdao.getfoodlist(menu_Id);
		System.out.println(list1);
		
		Integer availableFriesCount=list1.getCount();
		double availableFriesCost=list1.getCost();
		
		if(orderedFriesCount<availableFriesCount) {
			Integer finalCount=availableFriesCount-orderedFriesCount;
			double finalFriesCost=availableFriesCost*orderedFriesCount;
			list1.setCost(finalFriesCost);
			list1.setCount(finalCount);
			foodprocessdao.updatefoodlist(list1);
		}else {
			System.out.println("insufficient count.");
		}
		System.out.println("Here is your bill:");
		System.out.println("Food:"+list1.getMenu_list());
		System.out.println("Price:" +list1.getCost());
		return list1;

	}



	public FoodList selectDrinkList() {
		System.out.println("Enter the MenuId");
		Integer menu_Id=sc.nextInt();
		System.out.println("How many drink you want?");
		Integer orderedDrinkCount=sc.nextInt();
		
		FoodList list=new FoodList();
		list.setMenu_Id(menu_Id);
		list=foodprocessdao.getfoodlist(menu_Id);
		System.out.println(list);
		
		Integer availableDrinkCount=list.getCount();
		double availableDrinkCost=list.getCost();
		
		if(orderedDrinkCount<availableDrinkCount) {
			Integer finalCount=availableDrinkCount-orderedDrinkCount;
			double finalDrinkCost=availableDrinkCost*orderedDrinkCount;
			list.setCost(finalDrinkCost);
			list.setCount(finalCount);
			foodprocessdao.updatefoodlist(list);
		}else {
			System.out.println("insufficient count.");
		}
		System.out.println("Here is your bill:");
		System.out.println("Food:"+list.getMenu_list());
		System.out.println("Price:" +list.getCost());
		return list;

	}

}
