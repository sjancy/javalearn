package com.jancy.bank.main;

import java.util.Scanner;

import com.jancy.bankProjectService.AccountBankService;
import com.jancy.bankProjectService.CustomerBankService;
import com.jancy.bankProjectService.TransactionBankService;

public class bankProjectMainClass {
	
	
	private Scanner sc=new Scanner(System.in);

	private CustomerBankService service=new CustomerBankService();
	private AccountBankService accountService=new AccountBankService();
	private TransactionBankService transactionservice=new TransactionBankService();
	
	
	public static void main(String[] args) {
		bankProjectMainClass mainclass=new bankProjectMainClass();
		mainclass.ProcessMenu();
	}

	public void ProcessMenu() {
		
		boolean exitMenu = false;
		while (true) {
			System.out.println("##################");
			System.out.println("##  Main Menu  ##");
			System.out.println("##################");
			System.out.println("Enter your choice:");
			System.out.println("1. Customer details");
			System.out.println("2. Account details");
			System.out.println("3. Transcation details");
			System.out.println("4. Exit");
			System.out.println("Enter your choice:");
			int mainMenuOption = sc.nextInt();

			switch (mainMenuOption) {
			case 1:
				processCustomerMenu();
				break;
				
			case 2:
				processAccountMenu();
				break;

			case 3:
				processTransactionMenu();
				break;

			case 4:
				exitMenu = true;

			default:
				System.out.println("Invalid main menu option.  Please try again.");
			}

			if (exitMenu) {
				System.out.println("Exiting Application.");
				break;
			}
		}
		
	}



	private void processTransactionMenu() {
		boolean exitMenu = false;
		while (true) {
			System.out.println("########################");
			System.out.println("##  Transaction Menu  ##");
			System.out.println("########################");
			System.out.println("1. Add Transaction");
			System.out.println("2. View Transaction");
			System.out.println("3. Update Transaction");
			System.out.println("4. Delete Transaction");
			System.out.println("5. Return to Main Menu");
			System.out.println("Enter your choice:");
			int mainMenuOption = sc.nextInt();

			switch (mainMenuOption) {
			case 1:
				transactionservice.createTransaction();
				break;
			case 2:
				transactionservice.getTransaction();
				break;
			case 3:
				transactionservice.updateTransaction();
				break;
			case 4:
				transactionservice.deleteTransaction();
				break;
			case 5:
				exitMenu = true;
				break;
			default:
				System.out.println("Invalid transaction menu option.  Please try again.");
			}

			if (exitMenu) {
				break;
			}

		}
		
	}

	public void processCustomerMenu() {
		boolean exitMenu = false;
		while (true) {
			System.out.println("#####################");
			System.out.println("##  Customer Menu  ##");
			System.out.println("#####################");
			System.out.println("1. Add Customer");
			System.out.println("2. View Customer");
			System.out.println("3. Update Customer");
			System.out.println("4. Delete Customer");
			System.out.println("5. Return to Main Menu");
			System.out.println("Enter your choice:");
			int mainMenuOption = sc.nextInt();

			switch (mainMenuOption) {
			case 1:
				service.createCustomer();
				break;
			case 2:
				service.getCustomer();
				break;

			case 3:
				service.updateCustomer();
				break;
			case 4:
				service.deleteCustomer();
				break;
			case 5:
				exitMenu = true;
				break;

            	default:
				System.out.println("Invalid customer menu option.  Please try again.");
			}

			if (exitMenu) {
				break;
			}
		}
		
	}
	
	
	
	private void processAccountMenu() {
		boolean exitMenu = false;
		while (true) {
			System.out.println("####################");
			System.out.println("##  Account Menu  ##");
			System.out.println("####################");
			System.out.println("1. Add Account");
			System.out.println("2. View Account");
			System.out.println("3. Update Account");
			System.out.println("4. Delete Account");
			System.out.println("5. Return to Main Menu");
			System.out.println("Enter your choice:");
			int mainMenuOption = sc.nextInt();

			switch (mainMenuOption) {
			case 1:
				accountService.createAccount();
				break;
			case 2:
				accountService.getAccount();;
				break;
			case 3:
				accountService.updateAccount();
				break;
			case 4:
				accountService.deleteAccount();
				break;
			case 5:
				exitMenu = true;
				break;
			default:
				System.out.println("Invalid account menu option.  Please try again.");
			}

			if (exitMenu) {
				break;
			}
		}
	}
	
	
	


}
