package com.jancy.bankProjectService;

import java.util.Scanner;

import com.jancy.bankproject.Account1;
import com.jancy.bankproject.dao.Account1Dao;

public class AccountBankService {
	
	private Scanner sc=new Scanner(System.in);
	
	Account1Dao account1Dao = new Account1Dao();
	
	public void createAccount() {
		
		System.out.println("Enter Customer ID:");
		Integer customerId=sc.nextInt();
		System.out.println("Enter Account Balance:");
		Double accountBalance=sc.nextDouble();

		Account1 account1 = new Account1();
		account1.setCustomerId(customerId);
		account1.setAccountBalance(accountBalance);
		
		Integer newAccountId = account1Dao.getNewAccountId();
		account1.setAccountId(newAccountId);
		account1Dao.createaccount(account1);
	}
	
	public void updateAccount() {
		
		System.out.println("Enter Account ID:");
		int accountId=sc.nextInt();
		System.out.println("Enter Customer ID:");
		Integer customerId=sc.nextInt();
		System.out.println("Enter Account Balance:");
		Double accountBalance=sc.nextDouble();

		Account1 account1 = new Account1();
		account1.setAccountId(accountId);
		account1.setCustomerId(customerId);
		account1.setAccountBalance(accountBalance);
		
		account1Dao.updateaccount(account1);
		System.out.println("Account "+accountId+" updated.");
	}

	
	public void getAccount() {
		
		System.out.println("Enter Account ID:");
		int accountId=sc.nextInt();
		
		Account1 account1 = account1Dao.getaccount(accountId);
		System.out.println(account1);
	}
	
	public void deleteAccount() {
		System.out.println("Enter Account ID:");
		int accountId=sc.nextInt();

		account1Dao.deleteaccount(accountId);
		
		System.out.println("Account "+accountId+" deleted.");
	}
	



}
