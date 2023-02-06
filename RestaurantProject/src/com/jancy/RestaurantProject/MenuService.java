package com.jancy.RestaurantProject;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuService {

	private Scanner sc = new Scanner(System.in);

	private FoodService foodservice = new FoodService();

	private ArrayList<FoodList> orderedFoodList = new ArrayList<>();

	public static void main(String[] args) {

		MenuService service = new MenuService();
		service.ProcessMenu();
	}

	private void ProcessMenu() {


		boolean exitMenu = false;
		while (true) {

			System.out.println("**********");
			System.out.println("Menu List");
			System.out.println("**********");

			System.out.println("1.chickenburger");
			System.out.println("2.frenchfries");
			System.out.println("3.drinks");
			System.out.println("4.chicken naggets");
			System.out.println("5.Exit");
			System.out.println("6.Print Total Bill");
			System.out.println("What do you what:");
			int mainMenuOption = sc.nextInt();

			switch (mainMenuOption) {
			case 1:
				getBurgerDetails();
				break;
			case 2:
				getFrenchFriesDetails();
				break;
			case 3:
				getDrinkDetails();
				break;

			case 5:
				exitMenu = true;
				break;
			case 6:
				printTotalBill();
				break;
			// return;
			default:
				System.out.println("Invalid main menu option.  Please try again.");
			}

			if (exitMenu) {
				System.out.println("Exiting Application.");
				break;
			}
		}

	}


	private void getBurgerDetails() {
		System.out.println("Taking food order:");
		FoodList burgerFoodList = foodservice.selectfoodlist();
		orderedFoodList.add(burgerFoodList);

	}

	private void getFrenchFriesDetails() {
		FoodList frenchfriesFoodList = foodservice.frenchfrieslist();
		orderedFoodList.add(frenchfriesFoodList);
	}
	
	private void getDrinkDetails() {
		FoodList drinkFoodList = foodservice.selectDrinkList();
		orderedFoodList.add(drinkFoodList);
		
	}


	private void printTotalBill() {
		
		int i = 1;
		double totalCost = 0;
		String costomerFoodBill=null;
		double individualCost=0;
        System.out.println("**************");
		System.out.println(">>McDonald's<<");
		System.out.println("***************");
		System.out.println("Thank You for shopping with us!");
		System.out.println("FOOD ITEM" +"\t\t"+"PRICE");
		for (FoodList fl : orderedFoodList) {
			//System.out.println("Food Item: " + i);
			i++;
			//System.out.println(fl);
			costomerFoodBill=fl.getMenu_list();
			individualCost=fl.getCost();
			System.out.println(costomerFoodBill +"\t\t"+   individualCost);
			totalCost = totalCost + fl.getCost();
		}
		
		System.out.println("Total Cost:"+"\t\t"+ totalCost);
		orderedFoodList.clear();
	}

}
