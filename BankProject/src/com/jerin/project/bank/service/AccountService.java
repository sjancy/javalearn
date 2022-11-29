package com.jerin.project.bank.service;

import java.util.Scanner;

import com.jerin.project.bank.dao.AccountDao;
import com.jerin.project.bank.model.Account;

public class AccountService {
	
	private Scanner sc=new Scanner(System.in);
	
	AccountDao accountDao = new AccountDao();
	
	public void createAccount() {
		
		System.out.println("Enter Customer ID:");
		Integer customerId=sc.nextInt();
		System.out.println("Enter Account Balance:");
		Double accountBalance=sc.nextDouble();

		Account account = new Account();
		account.setCustomerId(customerId);
		account.setAccountBalance(accountBalance);
		
		Integer newAccountId = accountDao.getNewAccountId();
		account.setAccountId(newAccountId);
		accountDao.createAccount(account);
	}
	
	public void updateAccount() {
		
		System.out.println("Enter Account ID:");
		int accountId=sc.nextInt();
		System.out.println("Enter Customer ID:");
		Integer customerId=sc.nextInt();
		System.out.println("Enter Account Balance:");
		Double accountBalance=sc.nextDouble();

		Account account = new Account();
		account.setAccountId(accountId);
		account.setCustomerId(customerId);
		account.setAccountBalance(accountBalance);
		
		accountDao.updateAccount(account);
		System.out.println("Account "+accountId+" updated.");
	}
	
	public void getAccount() {
		
		System.out.println("Enter Account ID:");
		int accountId=sc.nextInt();
		
		Account account = accountDao.getAccount(accountId);
		System.out.println(account);
	}
	
	public void deleteAccount() {
		System.out.println("Enter Account ID:");
		int accountId=sc.nextInt();

		accountDao.deleteAccount(accountId);
		
		System.out.println("Account "+accountId+" deleted.");
	}
	
	

}
