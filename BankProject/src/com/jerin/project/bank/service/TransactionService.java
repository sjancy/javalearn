package com.jerin.project.bank.service;

import java.util.Scanner;

import com.jerin.project.bank.dao.AccountDao;
import com.jerin.project.bank.dao.TransactionDao;
import com.jerin.project.bank.model.Account;
import com.jerin.project.bank.model.Transaction;

public class TransactionService {

	public static final String WITHDRAW = "Withdraw";
	public static final String DEPOSIT = "Deposit";

	private Scanner sc = new Scanner(System.in);
	private TransactionDao transactionDao = new TransactionDao();
	private AccountDao accountDao = new AccountDao();

	public void createTransaction() {

		System.out.println("Enter Account ID:");
		Integer accountId = sc.nextInt();
		String transactionType = getTransactionType();
		System.out.println("Enter Transaction Amount:");
		Double transactionAmount = sc.nextDouble();

		Transaction transaction = new Transaction();
		transaction.setAccountId(accountId);
		transaction.setTransactionType(transactionType);
		transaction.setTransactionAmount(transactionAmount);

		Integer newTransactionId = transactionDao.getNewTransactionId();
		transaction.setTransactionId(newTransactionId);
		transactionDao.createTransaction(transaction);

		// Update Account
		Account account = accountDao.getAccount(accountId);
		account.setAccountBalance(getAccountBalance(account, transaction));
		accountDao.updateAccount(account);
	}

	public void updateTransaction() {

		System.out.println("Enter Transaction ID:");
		int transactionId = sc.nextInt();
		System.out.println("Enter Account ID:");
		Integer accountId = sc.nextInt();
		String transactionType = getTransactionType();
		System.out.println("Enter Transaction Amount:");
		Double transactionAmount = sc.nextDouble();

		Transaction transaction = new Transaction();
		transaction.setTransactionId(transactionId);
		transaction.setAccountId(accountId);
		transaction.setTransactionType(transactionType);
		transaction.setTransactionAmount(transactionAmount);

		transactionDao.updateTransaction(transaction);
		System.out.println("Transaction " + transactionId + " updated.");
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

	private Double getAccountBalance(Account account, Transaction transaction) {
		Double currentBalance = account.getAccountBalance();
		Double transactionAmount = transaction.getTransactionAmount();
		Double accountBalance = 0D;

		String transactionType = transaction.getTransactionType();

		if (transactionType.equals(WITHDRAW)) {
			accountBalance = currentBalance - transactionAmount;
		} else {
			accountBalance = currentBalance + transactionAmount;
		}
		return accountBalance;
	}

	public void getTransaction() {

		System.out.println("Enter Transaction ID:");
		int transactionId = sc.nextInt();

		Transaction transaction = transactionDao.getTransaction(transactionId);
		printTransaction(transaction);
	}

	public void deleteTransaction() {
		System.out.println("Enter Transaction ID:");
		int transactionId = sc.nextInt();

		transactionDao.deleteTransaction(transactionId);

		System.out.println("Transaction " + transactionId + " deleted.");
	}
	
	public void printTransaction(Transaction transaction) {
		System.out.println(transaction);
	}

}
