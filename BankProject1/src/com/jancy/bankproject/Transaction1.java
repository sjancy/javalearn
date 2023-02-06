package com.jancy.bankproject;

public class Transaction1 {
	
	private Integer transactionId;
	private Integer accountId;
	private String transactionType;
	private Double transactionAmount;
	
	public Integer getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(Integer transactionId) {
		this.transactionId = transactionId;
	}
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionTpye) {
		this.transactionType = transactionTpye;
	}
	public Double getTransactionAmount() {
		return transactionAmount;
	}
	public void setTransactionAmount(Double transactionAmount) {
		this.transactionAmount = transactionAmount;
	}
	
	public String toString() {
		return "Transaction1[transactionId= " +transactionId +", accountId= " + accountId + ", transactionType=" + transactionType + ", transactionAmount= " +transactionAmount+ "]";
	}

}
