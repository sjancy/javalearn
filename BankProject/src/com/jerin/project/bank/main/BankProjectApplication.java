package com.jerin.project.bank.main;

import java.util.Scanner;

import com.jerin.project.bank.service.AccountService;
import com.jerin.project.bank.service.CustomerService;
import com.jerin.project.bank.service.TransactionService;

public class BankProjectApplication {

	private Scanner sc = new Scanner(System.in);

	private CustomerService customerService = new CustomerService();

	private AccountService accountService = new AccountService();

	private TransactionService transactionService = new TransactionService();

	public static void main(String[] args) {

		BankProjectApplication bankProjectApplication = new BankProjectApplication();
		bankProjectApplication.processMainMenu();
	}

	public void processMainMenu() {

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
				customerService.createCustomer();
				break;
			case 2:
				customerService.getCustomer();
				break;
			case 3:
				customerService.updateCustomer();
				break;
			case 4:
				customerService.deleteCustomer();
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

	public void processAccountMenu() {
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
				accountService.getAccount();
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

	public void processTransactionMenu() {
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
				transactionService.createTransaction();
				break;
			case 2:
				transactionService.getTransaction();
				break;
			case 3:
				transactionService.updateTransaction();
				break;
			case 4:
				transactionService.deleteTransaction();
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

}
