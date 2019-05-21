package com.advanceamerica.graphqlcustomer.model;

/*
 * Holds all of the values in DirectDepositAccount
 */
public class DirectDepositAccountTuple {
	
	protected AccountTupleType accountType; //AccountTupleType
	
	protected AccountStatusTupleType accountStatusType; //AccountStatusTupleType
	
	protected String abaNumber; //BankAbaNumberType
	
	protected String accountNumber; //BankAccountNumberType
	
	public AccountTupleType getAccountType() {
		return accountType;
	}
	public AccountStatusTupleType getAccountStatusType() {
		return accountStatusType;
	}
	public String getAbaNumber() {
		return abaNumber;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountType(AccountTupleType accountType) {
		this.accountType = accountType;
	}
	public void setAccountStatusType(AccountStatusTupleType accountStatusType) {
		this.accountStatusType = accountStatusType;
	}
	public void setAbaNumber(String abaNumber) {
		this.abaNumber = abaNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
 }