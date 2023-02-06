package com.jancy.bankproject;

public class Account1 {

	private Integer accountId;
	private Integer customerId;
	private Double accountBalance;
	
	
	public Integer getAccountId() {
		return accountId;
	}
	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(Double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public String toString() {
		return "Account1[accountId=" + accountId + ",customerId =" + customerId + ", accountBalance=" + accountBalance + "]";
	}
	
}
