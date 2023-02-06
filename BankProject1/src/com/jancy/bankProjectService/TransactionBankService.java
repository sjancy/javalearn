package com.jancy.bankProjectService;

import java.util.Scanner;

import com.jancy.bankproject.Account1;
import com.jancy.bankproject.Transaction1;
import com.jancy.bankproject.dao.Account1Dao;
import com.jancy.bankproject.dao.Transaction1Dao;

public class TransactionBankService {
	
	public static final String WITHDRAW = "Withdraw";
	public static final String DEPOSIT = "Deposit";

	private Scanner sc = new Scanner(System.in);
    private Transaction1Dao transaction1dao=new Transaction1Dao();
	private Account1Dao account1dao=new Account1Dao();
	
	public void createTransaction() {

		System.out.println("Enter Account ID:");
		Integer accountId = sc.nextInt();
		String transactionType = getTransactionType();
		System.out.println("Enter Transaction Amount:");
		Double transactionAmount = sc.nextDouble();
		
		Transaction1 transaction1 = new Transaction1();
		transaction1.setAccountId(accountId);
		transaction1.setTransactionType(transactionType);
		transaction1.setTransactionAmount(transactionAmount);
		
		
		Integer newTransactionId = transaction1dao.getNewTransactionId();
		transaction1.setTransactionId(newTransactionId);
		transaction1dao.createtransaction(transaction1);


		Account1 account1 = account1dao.getaccount(accountId);
		account1.setAccountBalance(getAccountBalance(account1, transaction1));
		account1dao.updateaccount(account1);
	}

	private Double getAccountBalance(Account1 account1, Transaction1 transaction1) {
		Double currentBalance = account1.getAccountBalance();
		Double transactionAmount = transaction1.getTransactionAmount();
		Double accountBalance = 0D;

		String transactionType = transaction1.getTransactionType();

		if (transactionType.equalsIgnoreCase(WITHDRAW)) {
			
		
			accountBalance = currentBalance - transactionAmount;
		
			} else {
			accountBalance = currentBalance + transactionAmount;
		}
		return accountBalance;
	}

	private String getTransactionType() {
		System.out.println("Enter Transaction Type [W - Withdraw / D - Deposit]:");
		String transactionType = sc.next();
		if (transactionType != null && transactionType.equalsIgnoreCase("W")) {
			transactionType = WITHDRAW;
		} else {
			transactionType = DEPOSIT;
		}
		return transactionType;
	}
	
	
	
	public void getTransaction() {

		System.out.println("Enter Transaction ID:");
		int transactionId = sc.nextInt();

		Transaction1 transaction1 = transaction1dao.gettransaction(transactionId);
		System.out.println(transaction1);
	}

	public void updateTransaction() {

		System.out.println("Enter Transaction ID:");
		int transactionId = sc.nextInt();
		System.out.println("Enter Account ID:");
		Integer accountId = sc.nextInt();
		String transactionType = getTransactionType();
		System.out.println("Enter Transaction Amount:");
		Double transactionAmount = sc.nextDouble();
		
		Transaction1 transaction1 = new Transaction1();
		transaction1.setTransactionId(transactionId);
		transaction1.setAccountId(accountId);
		transaction1.setTransactionType(transactionType);
		transaction1.setTransactionAmount(transactionAmount);
		
		transaction1dao.updatetransaction(transaction1);
		System.out.println("Transaction " + transactionId + " updated.");
	}
	
	public void deleteTransaction() {
		System.out.println("Enter Transaction ID:");
		int transactionId = sc.nextInt();

		transaction1dao.deletetransaction(transactionId);

		System.out.println("Transaction " + transactionId + " deleted.");
	}



}
